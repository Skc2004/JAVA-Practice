import java.util.Scanner;
public class Integer_Checker
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        boolean check=sc.hasNextInt();
        if(check==true)
        {
            System.out.println("The number is An Integer !");
        }
        else
        {
            System.out.println("The number is not An Integer !");
        }
    }
}
