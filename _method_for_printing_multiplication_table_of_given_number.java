import java.util.Scanner;
public class _method_for_printing_multiplication_table_of_given_number
{
    public static void multiplication_table(int a)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(a +" x "+ i+" = "+a*i);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is required !!");
        int n=sc.nextInt();
        System.out.println("The multiplication table of "+n+ " is as follows :- ");
        System.out.println("---------------------------------------------------");
        multiplication_table(n);
    }
}
