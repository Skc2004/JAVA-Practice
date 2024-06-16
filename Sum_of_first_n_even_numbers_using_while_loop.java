import java.util.Scanner;
public class Sum_of_first_n_even_numbers_using_while_loop
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of first n even numbers of which you wanna find the sum :- ");
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<n)
        {
            sum=sum+(2*i);
            i++;
        }
        System.out.println("The sum is : "+sum);
    }
}
