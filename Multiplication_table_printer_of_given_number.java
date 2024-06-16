import java.util.Scanner;
public class Multiplication_table_printer_of_given_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is required :- ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = " + (n*i));
        }
    }
}
