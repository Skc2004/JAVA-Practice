import java.util.Scanner;

public class While3 
{
    int input;

    void takeinput()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        input = sc.nextInt();
        sc.close();
    }

    int sum()
    {
        int i=1;
        int sum=0;
        while(i<=input)
        {
            sum=sum+i;
            i++;
        }
        return sum;
    }

    void display()
    {
        System.out.println("The Sum of natural numbers: "+sum());
    }

    public static void main(String args[])
    {
        While3 obj=new While3();
        obj.takeinput();
        obj.display();
    }
}