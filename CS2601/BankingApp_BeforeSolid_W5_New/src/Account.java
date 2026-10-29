public abstract class Account {
    private String accountId;
    protected double balance;

    public Account(String accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public String getAccountId() { return accountId; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public abstract boolean withdraw(double amount);
}