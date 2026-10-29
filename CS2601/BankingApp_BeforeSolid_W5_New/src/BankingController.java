
// A really "fat" BankingController.java that will be improved over the next weeks
public class BankingController {

	// FLAW: Hardcoded concrete dependencies (No Dependency Inversion)
	private FileRepository dataStorage = new FileRepository();
	private ExternalNetworkClient networkClient = new ExternalNetworkClient();

	// FLAW: Controller holds security state
	private UserSession currentSession = null;

	public void login(String customerId, String password) {
		System.out.println("Processing login for Customer ID: " + customerId);

		// Simulating a successful login
		this.currentSession = new UserSession(customerId);

		System.out.println("Login successful. Session is now ACTIVE.");
	}

	public double getBalance(String accountId) {
		if (currentSession == null) {
			System.out.println("ERROR: Session invalid. Please login.");
			return 0.0;
		}

		Customer customer = dataStorage.readCustomerData(currentSession.getActiveCustomerId());

		// FLAW: Controller manually searches through the domain objects
		for (Account account : customer.getAccounts()) {
			if (account.getAccountId().equals(accountId)) {
				System.out.println("Balance retrieved: £" + account.getBalance());
				return account.getBalance();
			}
		}
		System.out.println("ERROR: Account not found.");
		return 0.0;
	}

	public void executeTransfer(String fromAccountId, String toExternalAccount, double amount) {
		        if (currentSession == null) {
           			 System.out.println("ERROR: Session invalid. Please log in.");
           			 return;
        			}


		System.out.println("Starting transfer of £" + amount + " from " + fromAccountId + " to " + toExternalAccount);

		Customer customer = dataStorage.readCustomerData(currentSession.getActiveCustomerId());
		Account sourceAccount = null;

		// FLAW: Procedural search logic inside the controller
		for (Account account : customer.getAccounts()) {
			if (account.getAccountId().equals(fromAccountId)) {
				sourceAccount = account;
				break;
			}
		}

		if (sourceAccount != null) {
			// FLAW: Controller directly choreographs 3rd-party network calls
			boolean isValid = networkClient.verifyExternalAccount(toExternalAccount);

			if (isValid) {
				// FLAW: Controller is manually doing Domain math (Violates Encapsulation)
				double newBalance = sourceAccount.getBalance() - amount;
				sourceAccount.deposit(newBalance);

				networkClient.clearExternalFunds(toExternalAccount, amount);
				dataStorage.saveCustomerData(customer);

				System.out.println("Transfer complete. New balance is: £" + sourceAccount.getBalance());
			} else {
				System.out.println("ERROR: External account verification failed.");
			}
		}
	}

	public void exportBalanceReport() {
		if (!currentSession.isValid())
			return;

		Customer customer = dataStorage.readCustomerData(currentSession.getActiveCustomerId());
		System.out.println("--- GENERATING PORTFOLIO REPORT ---");
		System.out.println("Customer: " + customer.getName());

		for (Account account : customer.getAccounts()) {
			System.out.println("Account [" + account.getAccountId() + "] Available Funds: £" + account.getBalance());
		}
		System.out.println("-----------------------------------");
	}
}