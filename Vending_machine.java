import java.util.Scanner;
public class Vending_machine 
{
    static int choice;
    static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Vending Machine");
        System.out.println();
        System.out.println("1. Juice");
        System.out.println("2. Soda");
        System.out.println();
        System.out.print("Enter your choice: ");
        choice =sc.nextInt();
        sc.close();
    }

    static void check()
    {
        if(choice==1)
        {
            System.out.println("Dispensing juice.");
        }
        else if(choice == 2)
        {
            System.out.println("Dispensing soda.");
        }
        else
        {
            System.out.println("Invalid Choice!");
        }
    }
    
    public static void main(String args[])
    {
        input();
        check();
    }
}
