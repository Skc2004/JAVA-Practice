import java.util.Scanner;

public class BankAccount 
{
    public long accountNumber;
    public String accountHolderName;
    public double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double deposit)
    {
        balance += deposit;
    }

    public void withdraw(double withdraw)
    {
        if (withdraw > balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance -= withdraw;
        }
    }

    public int choice(Scanner sc)
    {
        System.out.println("Enter your choice:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        return sc.nextInt();
    }

    public void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter the Account Number: ");
        long accountNumber = sc.nextLong();
        System.out.print("Enter the Current Balance: ");
        double balance = sc.nextDouble();
        
        BankAccount obj = new BankAccount(accountNumber, accountHolderName, balance);

        while (true) 
        {
            int choice = obj.choice(sc);
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the amount to be deposited: ");
                    double deposit = sc.nextDouble();
                    obj.deposit(deposit);
                    System.out.println("Amount deposited successfully");
                    System.out.println("Account Summary:");
                    obj.display();
                    break;

                case 2:
                    System.out.print("Enter the amount to be withdrawn: ");
                    double withdraw = sc.nextDouble();
                    obj.withdraw(withdraw);
                    System.out.println("Account Summary:");
                    obj.display();
                    break;

                case 3:
                    System.out.println("Account Summary:");
                    obj.display();
                    break;

                case 4:
                    System.out.println("Exiting the program");
                    sc.close();
                    System.exit(0);

                default: 
                    System.out.println("Invalid choice");
            }
        }
    }
}
