

// UserSession.java
public class UserSession {
    private String activeCustomerId;
    private SessionState currentState;

    public UserSession(String customerId) {
        this.activeCustomerId = customerId;
        this.currentState = SessionState.ACTIVE;
    }

    public boolean isValid() {
        return this.currentState == SessionState.ACTIVE;
    }

    public String getActiveCustomerId() { return activeCustomerId; }
    public SessionState getCurrentState() { return currentState; }
    
}