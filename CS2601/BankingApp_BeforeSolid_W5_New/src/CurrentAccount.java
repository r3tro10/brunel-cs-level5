public class CurrentAccount extends Account {
    private double overdraftLimit = 500.0;

    public CurrentAccount(String accountId) {
        super(accountId);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            return true;
        }
        return false;
    }
}