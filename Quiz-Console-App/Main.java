import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz");
        System.out.println("-----------------------------");
        System.out.println();

        System.out.println("Choose the Mode: ");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println();

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch(choice)
        {
            case 1:
                AdminController admin=new AdminController();
                admin.main(args);
                break;
            
            case 2:
                UserController user=new UserController();
                user.main(args);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}