public class prg5  {
    private String accountNumber;
    private double balance;
    private double interestRate;

    // Constructor
    public prg5(String accountNumber, double initialBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate; // Interest rate as a percentage (e.g., 5 for 5%)
    }

    // Mutable function to update the balance of the bank account
    public void updateBalance(double amount) {
        balance += amount; // Update the balance by adding the given amount
        System.out.println("Updated balance: " + balance);
    }

    // Immutable function to calculate the interest earned on the bank account
    public double calculateInterest(int years) {
        return (balance * interestRate / 100) * years; // Interest = PRT
    }

    public static void main(String[] args) {
        prg5 account = new prg5("123456789", 1000.00, 5.0); // Create a bank account with initial balance and interest rate

        // Display initial balance
        System.out.println("Initial balance: " + account.balance);

        // Update the balance
        account.updateBalance(500.00); // Deposit $500
        account.updateBalance(-200.00); // Withdraw $200

        // Calculate and display interest earned over 3 years
        double interestEarned = account.calculateInterest(3); // Calculate interest for 3 years
        System.out.println("Interest earned over 3 years: " + interestEarned);
    }
}
