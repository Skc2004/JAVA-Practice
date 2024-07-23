import java.util.Scanner;
class Even_Odd_Check
{
    static int num;
    static void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number to be checked: ");
        num=sc.nextInt();
        sc.close();
    }
    static void check()
    {
        if(num%2==0)
        {
            System.out.println("Even Number!");
        }
        else
        {
            System.out.println("Odd Number!");
        }
    }
    public static void main(String args[])
    {
        input();
        check();
    }
}