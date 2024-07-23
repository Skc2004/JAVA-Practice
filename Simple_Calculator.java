import java.util.Scanner;
public class Simple_Calculator 
{
    static int choice;
    static int a,b;
    static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 for addition or 2 for subtraction: ");
        choice=sc.nextInt();
        System.out.println("Enter a and b respectively: ");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
    }

    static void check(int a,int b)
    {
        if(choice==1)
        {
            System.out.println("Sum: "+ (a+b));
        }
        else
        {
            System.out.println("Subtract: "+ (a-b));
        }
    }

    public static void main(String args[])
    {
        input();
        check(a,b);
    }
}
