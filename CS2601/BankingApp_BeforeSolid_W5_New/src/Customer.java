// Customer.java
import java.util.ArrayList;
import java.util.List;

// FLAW: The Domain model holds data but no business logic. 
public class Customer {
    private String customerId;
    private String name;
    private List<Account> accounts;

    
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        // It's best practice to initialize the list in the constructor
        // so it's never null when we try to add an account later!
        this.accounts = new ArrayList<>();
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Account> getAccounts() { return accounts; }
    public void addAccount(Account account) { this.accounts.add(account); }
}