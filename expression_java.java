import java.util.Scanner;
public class expression_java
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of v");
        double v=sc.nextDouble();
        System.out.println("Enter the value of u");
        double u=sc.nextDouble();
        System.out.println("Enter the value of a");
        double a=sc.nextDouble();
        System.out.println("Enter the value of S");
        double S=sc.nextDouble();
        double exp=((v*v)-(u*u))/(2*a*S);
        System.out.println("The value of expression is : "+ exp);
    }
}
