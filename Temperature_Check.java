import java.util.Scanner;
public class Temperature_Check 
{
    static int temp;
    static void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temp=sc.nextInt();
        sc.close();
    }

    static void check()
    {
        if(temp>30)
        {
            System.out.println("It's hot!");
        }
        else if(temp>20)
        {
            System.out.println("It's warm!");
        }
        else if(temp>10)
        {
            System.out.println("It's cool!");
        }
        else
        {
            System.out.println("It's cold!");
        }
    }

    public static void main(String args[])
    {
        input();
        check();
    }
}
