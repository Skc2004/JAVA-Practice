class BankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;
    private static final double MIN_BALANCE = 0.0;  // Minimum balance allowed

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= MIN_BALANCE) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
    }

    // Public getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Public method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= MIN_BALANCE) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal denied.");
            }
        } else {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }
}


public class Bank {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance
        BankAccount account = new BankAccount("123456789", 500.00);

        // Display account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit funds
        account.deposit(150.00);

        // Withdraw funds
        account.withdraw(200.00);

        // Attempt to withdraw more funds than available
        account.withdraw(600.00);

        // Display final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
