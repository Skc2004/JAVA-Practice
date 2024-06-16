import java.util.Scanner;
public class Leap_year_founder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to be checked :- ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("The entered year is a Leap Year");
        }
        else
        {
            System.out.println("The entered year is not a Leap Year");
        }
    }
}
