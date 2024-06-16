import java.util.Scanner;
public class Factorial_of_given_number_using_for_loop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial is required");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is : "+ fact);
    }
}
