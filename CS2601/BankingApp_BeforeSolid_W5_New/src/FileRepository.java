// FileRepository.java
import java.util.HashMap;
import java.util.Map;

public class FileRepository {
    
    private String databaseFilePath = "bank_database.txt";
    
    // MOCK: We use a static map to fake a persistent file on the hard drive. 
    // This allows us to focus entirely on architecture without writing complex Java File I/O code.
    private static Map<String, Customer> fakeFileSystem = new HashMap<>();

    public Customer readCustomerData(String customerId) {
        System.out.println("[FILE I/O] Opening file: " + databaseFilePath);
        System.out.println("[FILE I/O] Reading data for customer: " + customerId);
        
        return fakeFileSystem.get(customerId);
    }

    public void saveCustomerData(Customer customer) {
        System.out.println("[FILE I/O] Opening file: " + databaseFilePath);
        System.out.println("[FILE I/O] Saving records for customer: " + customer.getCustomerId());
        
        fakeFileSystem.put(customer.getCustomerId(), customer);
    }
}