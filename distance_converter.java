import java.util.Scanner;
public class distance_converter
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 to convert From km to miles and 2 to convert From miles to km");
        int choice=in.nextInt();
        if (choice==1)
        {
            System.out.println("Enter the distance in Kilometre :-");
            double s1=in.nextDouble();
            double out= s1*0.621371;
            System.out.println("The distance in Miles is "+ out);
        }
        else
        {
            System.out.println("Enter the distance in Miles :-");
            double s2=in.nextDouble();
            double out2= s2*1.60934;
            System.out.println("The distance in Kilometre is "+ out2);
        }
    }
}
