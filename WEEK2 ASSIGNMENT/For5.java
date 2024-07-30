import java.util.Scanner;
public class For5 
{
    double principal;
    double rate;
    double years;
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();
        System.out.print("No. of Years: ");
        years= sc.nextDouble();
        sc.close();
    }

    double calculate()
    {
        double SimpleInterest= (principal*rate*years)/100;
        return SimpleInterest;
    }

    void display()
    {
        System.out.println("The Simple Interest is : "+ calculate());
    }

    public static void main(String args[])
    {
        For5 obj= new For5();
        obj.input();
        obj.display();
    }
}