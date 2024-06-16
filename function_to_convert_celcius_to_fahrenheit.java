import java.util.Scanner;
public class function_to_convert_celcius_to_fahrenheit
{
    public static double Cel_to_fah(double c)
    {
        return c+273.0;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperature in Celcius, atleast till 2 decimal places or till wished :- ");
        double c=sc.nextDouble();
        System.out.println("The Temperature in Fahrenheit is : "+Cel_to_fah(c));
    }
}
