import java.util.Scanner;
public class Sum_of_all_numbers_occuring_in_multiplication_table_of_given_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number required :- ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+(n*i);
        }
        System.out.println("The sum of all numbers occuring in the multiplication table of "+n+ " is : "+sum);
    }
}
