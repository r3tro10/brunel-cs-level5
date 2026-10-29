
// ExternalNetworkClient.java
public class ExternalNetworkClient {
    
    public boolean verifyExternalAccount(String targetAccountId) {
        System.out.println("[NETWORK] Verifying external routing for account: " + targetAccountId);
        // Simulating a successful network ping
        return true; 
    }

    public void clearExternalFunds(String targetAccountId, double amount) {
        System.out.println("[NETWORK] Clearing £" + amount + " to external account: " + targetAccountId);
    }
}