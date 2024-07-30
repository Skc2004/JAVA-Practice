import java.util.Scanner;

public class While4 
{
    public static void main(String args[])
    {
        int number,i=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of series : ");
        number=sc.nextInt();

        int sum=0;
        System.out.println("Start entering "+ number+" numbers is sequence:- ");
        while(i<number)
        {
            sum=sum+sc.nextInt();
            i++;
        }

        double avg=sum/number;
        sc.close();

        System.out.println("The average is: "+avg);
    }
}
