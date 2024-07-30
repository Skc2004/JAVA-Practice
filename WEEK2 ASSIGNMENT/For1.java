import java.util.Scanner;
class For1
{
    int input;
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        input= sc.nextInt();
        sc.close();
    }

    int factorial_calculation(int n)
    {
        int fact=1;
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }
        return fact;
    }

    void display()
    {
        System.out.println("The Factorial is: "+factorial_calculation(input));
    }

    public static void main(String args[])
    {
        For1 obj=new For1();
        obj.input();
        obj.display();
    }
}