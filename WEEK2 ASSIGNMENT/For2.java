import java.util.Scanner;

public class For2
{
    int input;

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        input = sc.nextInt();
        sc.close();
    }

    void display()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(input + " * "+i+" = "+input*i);
        }
    }

    public static void main(String args[])
    {
        For2 obj= new For2();
        obj.input();
        obj.display();
    }
}
