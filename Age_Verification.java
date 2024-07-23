import java.util.Scanner;
public class Age_Verification
{
    static int age;
    static void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age for Verification: ");
        age=sc.nextInt();
        sc.close();
    }
    
    static void check()
    {
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void main(String args[])
    {
        input();
        check();
    }
}
