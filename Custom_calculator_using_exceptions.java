import java.util.*;
class Invalid_Input_Exceptions extends Exception
{
    @Override
    public String toString()
    {
        return "Your Input is Invalid";
    }
}
class Cannot_Divide_by_0 extends Exception
{
    @Override
    public String toString() {
        return "Your input means dividing by zero which is not possible";
    }
}
class Max_Input extends Exception
{
    @Override
    public String toString()
    {
        return "Your Input is above max limit";
    }
}
public class Custom_calculator_using_exceptions
{
    public static double x;
    public static double y;
    public static boolean flag;
    public static boolean flag1;
    public static double Addition(double a, double b)
    {
        return a+b;
    }
    public static double Subtraction(double a, double b)
    {
        return a-b;
    }
    public static double Multiplication(double a, double b)
    {
        return a*b;
    }
    public static double Division (double a, double b)
    {
        return a/b;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input 1");
        try
        {
            x=sc.nextDouble();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            System.exit(50);
        }
        System.out.println("Enter the input 2");
        try
        {
            y=sc.nextDouble();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            System.exit(50);
        }
    }
    public double input1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        double z=0;
        try
        {
            z=sc.nextDouble();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            System.exit(50);
        }
        return z;
    }
    public void Max_Input_Exception_Checker(double a, double b)
    {
        if(a>=100000 || b>=100000) {
            try
            {
                throw new Max_Input();
            }
            catch(Max_Input e)
            {
                System.out.println(e.toString());
                flag=false;
            }
        }
    }
    public void Max_Input_Exception_Checker1(double a)
    {
        if(a>=100000) {
            try
            {
                throw new Max_Input();
            }
            catch(Max_Input e)
            {
                System.out.println(e.toString());
                flag1=false;
            }
        }
    }
    public void Max_Mul_Input_Exception_Checker(double a, double b)
    {
        if(a>=7000 || b>=7000) {
            try
            {
                throw new Max_Input();
            }
            catch(Max_Input e)
            {
                System.out.println(e.toString());
                flag=false;
            }
        }
    }
    public void Max_Mul_Input_Exception_Checker1(double a)
    {
        if(a>=100000) {
            try
            {
                throw new Max_Input();
            }
            catch(Max_Input e)
            {
                System.out.println(e.toString());
                flag1=false;
            }
        }
    }
    public void Cannot_Divide_by_0_Exception_Checker (double a, double b)
    {
        if(b==0)
        {
            try
            {
                throw new Cannot_Divide_by_0();
            }
            catch(Cannot_Divide_by_0 e)
            {
                System.out.println(e.toString());
                flag=false;
            }
        }
    }
    public void Cannot_Divide_by_0_Exception_Checker_1 (double a)
    {
        if(a==0)
        {
            try
            {
                throw new Cannot_Divide_by_0();
            }
            catch(Cannot_Divide_by_0 e)
            {
                System.out.println(e.toString());
                flag1=false;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE MODERN CALCULATOR");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Choose one of the following options to perform :- ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println();
        System.out.println("Enter your choice :- ");
        int ch = sc.nextInt();
        Custom_calculator_using_exceptions obj = new Custom_calculator_using_exceptions();
        flag=true;
        flag1=true;
        switch(ch)
        {
            case 1:
            {
                System.out.println("Welcome to the Additions Section");
                System.out.println("--------------------------------");
                System.out.println();
                System.out.println("Enter the number of numbers you want to add :- ");
                int i =sc.nextInt();
                System.out.println();
                if(i==2)
                {
                    obj.input();
                    obj.Max_Input_Exception_Checker(x, y);
                    if(flag==true)
                    {
                        double sum = Addition(x, y);
                        System.out.println("The Sum is : " + sum);
                    }
                }
                else
                {
                    double sum1=0;
                    for(int j=1;j<=i;j++)
                    {
                        double q= obj.input1();
                        obj.Max_Input_Exception_Checker1(q);
                        if(flag1==true)
                        {
                            sum1=Addition(sum1,q);
                        }
                    }
                    System.out.println("The Sum is : "+ sum1);
                }
                break;
            }
            case 2:
            {
                System.out.println("Welcome to the Subtraction Section");
                System.out.println("--------------------------------");
                System.out.println();
                System.out.println("Enter the number of numbers you want to Subtract :- ");
                int i =sc.nextInt();
                System.out.println();
                if(i==2)
                {
                    obj.input();
                    obj.Max_Input_Exception_Checker(x, y);
                    if(flag==true)
                    {
                        double diff = Subtraction(x, y);
                        System.out.println("The Difference is : " + diff);
                    }
                }
                else
                {
                    double diff1=0;
                    for(int j=1;j<=i;j++)
                    {
                        double q= obj.input1();
                        obj.Max_Input_Exception_Checker1(q);
                        if(flag1==true)
                        {
                            diff1=Subtraction(diff1,q);
                        }
                    }
                    System.out.println("The Difference is : "+ diff1);
                }
                break;
            }
            case 3:
            {
                System.out.println("Welcome to the Multiplication Section");
                System.out.println("--------------------------------");
                System.out.println();
                System.out.println("Enter the number of numbers you want to multiply :- ");
                int i =sc.nextInt();
                System.out.println();
                if(i==2)
                {
                    obj.input();
                    obj.Max_Mul_Input_Exception_Checker(x, y);
                    if(flag==true)
                    {
                        double mul = Multiplication(x, y);
                        System.out.println("The Product is : " + mul);
                    }
                }
                else
                {
                    double mul2=1;
                    for(int j=1;j<=i;j++)
                    {
                        double q= obj.input1();
                        obj.Max_Mul_Input_Exception_Checker1(q);
                        if(flag1==true)
                        {
                            mul2=Multiplication(mul2,q);
                        }
                    }
                    System.out.println("The Product is : "+ mul2);
                }
                break;
            }
            case 4:
            {
                System.out.println("Welcome to the Division Section");
                System.out.println("-------------------------------");
                System.out.println();
                System.out.println("Enter the number of numbers you want to perform the operation :- ");
                int i =sc.nextInt();
                System.out.println();
                if(i==2)
                {
                    obj.input();
                    obj.Cannot_Divide_by_0_Exception_Checker(x, y);
                    if(flag==true)
                    {
                        double div = Division(x, y);
                        System.out.println("The Quotient is : " + div);
                    }
                }
                else
                {
                   obj.input();
                    if(x==0)
                    {
                        System.out.println("This Division is not required to proceed cause your first number is 0 !!");
                    }
                    else
                    {
                        obj.Cannot_Divide_by_0_Exception_Checker_1(y);
                        double p;
                        if(flag1==true)
                        {
                            double div2= Division(x,y);
                            for(int j=2;j<=i;j++)
                            {
                                p =obj.input1();
                                div2=Division(div2,p);
                            }
                            System.out.println("The Quotient is : "+div2);
                        }
                    }
                }
                break;
            }
            default :
            {
                System.out.println("Wrong Choice !!!!");
            }
        }
        System.out.println("Thank You for using the Calculator!!");
    }
}
