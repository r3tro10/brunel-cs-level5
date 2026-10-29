
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountId) {
        super(accountId);
        this.interestRate = 0.0;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        // Savings accounts typically don't allow overdrafts
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}