import java.util.Scanner;
public class sum_of_first_n_natural_numbers_using_recursion
{
    public static int sum(int a)
    {
        if(a==0)
        {
            return 0;
        }
        else
        {
            return a + sum(a - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of first natural numbers whose sum is required :- ");
        int n=sc.nextInt();
        System.out.println("The sum of first "+n+" natural numbers is : "+sum(n));
    }
}
