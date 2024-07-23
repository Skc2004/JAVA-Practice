import java.util.Scanner;
public class Positive_Negative_Zero 
{
    static int num;
    
    static void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        sc.close();
    }

    static void check()
    {
        if(num>0)
        {
            System.out.println("The number is positive!");
        }
        else if(num<0)
        {
            System.out.println("The number is negative!");
        }
        else
        {
            System.out.println("The number is zero!");
        }
    }

    public static void main(String args[])
    {
        input();
        check();
    }
}
