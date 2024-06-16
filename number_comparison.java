import java.util.Scanner;
public class number_comparison
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be compared with 55 :-");
        int c=sc.nextInt();
        if(c==55)
        {
            System.out.println("The input is equal to 55");
        }
        else if(c<55)
        {
            System.out.println("The input is less than 55");
        }
        else
        {
            System.out.println("The input is greater than 55");
        }
    }
}
