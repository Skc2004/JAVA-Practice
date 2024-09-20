import java.util.Scanner;
public class Addition_of_Two_numbers 
{
    private int num1 , num2; 
    
    public Addition_of_Two_numbers(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }

    public static int accept(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the "+ n+"st integer: ");
        int num=sc.nextInt();
        return num;
    }

    public int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String args[])
    {
        int num1=accept(1);
        int num2=accept(2);
        Addition_of_Two_numbers obj=new Addition_of_Two_numbers(num1,num2);
        System.out.println("Sum of two numbers is: "+obj.sum(num1,num2));
    }
}
