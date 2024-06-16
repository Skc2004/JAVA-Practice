import java.util.Scanner;
public class average_of_numbers_passed_as_arguments
{
    public static double average(int ...a)
    {
        double sum=0.0;
        for(double z:a)
        {
            sum=sum+z;
        }
        return sum/a.length;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose from the following :- ");
        System.out.println("-----------------------------");
        System.out.println("1. Average of 2 numbers");
        System.out.println("2. Average of 3 numbers");
        System.out.println("3. Average of 4 numbers");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Enter the numbers :- ");
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                System.out.println("The average is : "+average(a1,a2));
                break;
            }
            case 2:
            {
                System.out.println("Enter the numbers :- ");
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                int a3=sc.nextInt();
                System.out.println("The average is : "+average(a1,a2,a3));
                break;
            }
            case 3:
            {
                System.out.println("Enter the numbers :- ");
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                int a3=sc.nextInt();
                int a4=sc.nextInt();
                System.out.println("The average is : "+average(a1,a2,a3,a4));
                break;
            }
            default :
            {
                System.out.println("Wrong Option Bitch!!!");
                break;
            }
        }
    }
}
