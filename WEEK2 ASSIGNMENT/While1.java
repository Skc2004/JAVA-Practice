import java.util.Scanner;

public class While1 
{
    int input;

    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        input = sc.nextInt();
        sc.close();
    }

    void display()
    {
        int n=1;
        while(n<=10)
        {
            System.out.println(input + " * "+ n+" = "+input*n);
            n++;
        }
    }

    public static void main(String args[])
    {
        While1 obj= new While1();
        obj.input();
        obj.display();
    }
}