// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting Banking Application Simulator ===\n");
        
        // 1. Setup Phase: Seed the fake file repository with our dummy customer
        setupDummyData();
        
        // 2. Execution Phase: Instantiate the Controller and run tests
        BankingController controller = new BankingController();
        
        System.out.println("\n--- Test 1: Attempt Action Without Login ---");
        controller.getBalance("ACC-CURRENT-1001");
        
        System.out.println("\n--- Test 2: User Login ---");
        controller.login("CUST-999", "password123");
        
        System.out.println("\n--- Test 3: Check Balance (Current Account) ---");
        controller.getBalance("ACC-CURRENT-1001");
        
        System.out.println("\n--- Test 4: Check Balance (Savings Account) ---");
        controller.getBalance("ACC-SAVINGS-2002");
        
        System.out.println("\n--- Test 5: Execute Transfer ---");
        controller.executeTransfer("ACC-CURRENT-1001", "EXT-BARCLAYS-555", 250.00);
        
        System.out.println("\n--- Test 6: Export Report ---");
        controller.exportBalanceReport();
        
        System.out.println("\n=== Simulation Complete ===");
    }

    /**
     * Helper method to create the domain objects and save them to our simulated file system
     * before the main application starts.
     */
    private static void setupDummyData() {
System.out.println("\n--- Seeding Database File ---");
        
        // 1. Create a repository instance (to persist the dummy data)
        FileRepository repo = new FileRepository();

        // 2. Instantiate accounts using the new constructor (ID-based)
        Account current = new CurrentAccount("ACC-CURRENT-1001");
        Account savings = new SavingsAccount("ACC-SAVINGS-2002");
        
        // 3. Use deposit() instead of setBalance()
        current.deposit(1500.0);
        savings.deposit(4000.0);
        
        // 4. Create customer and associate accounts
        Customer alice = new Customer("CUST-999", "Alice Smith");
        alice.addAccount(current);
        alice.addAccount(savings);
        
        // 5. Save the data
        repo.saveCustomerData(alice);
        
        System.out.println("--- Mock Account Setup Complete ---");
    }
}