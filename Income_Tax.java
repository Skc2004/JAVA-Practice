import java.util.Scanner;
public class Income_Tax
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your Income Slab :- ");
        System.out.println("1. Below 2.5 Lakh ");
        System.out.println("2. From 2.5 Lakh to 5.0 Lakh ");
        System.out.println("3. From 5.0 Lakh to 10.0 Lakh ");
        System.out.println("4. Above 10.0 Lakh");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter your income :- ");
                double income=sc.nextDouble();
                System.out.println("The payable amount of Tax is : "+ 0.0);
                break;
            }
            case 2:
            {
                System.out.println("Enter your income :- ");
                double income=sc.nextDouble();
                System.out.println("The payable amount of Tax is : "+ 0.05*income);
                break;
            }
            case 3:
            {
                System.out.println("Enter your income :- ");
                double income=sc.nextDouble();
                System.out.println("The payable amount of Tax is : "+ 0.2*income);
                break;
            }
            case 4:
            {
                System.out.println("Enter your income :- ");
                double income=sc.nextDouble();
                System.out.println("The payable amount of Tax is : "+ 0.3*income);
                break;
            }
            default :
            {
                System.out.println("Wrong Choice!!!!!!!!!!!!!");
                break;
            }
        }
    }
}
