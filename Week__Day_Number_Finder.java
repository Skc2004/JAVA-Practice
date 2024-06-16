import java.util.Scanner;
public class Week__Day_Number_Finder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 to find the associated week day !");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Monday");
        }
        else if(ch==2)
        {
            System.out.println("Tuesday");
        }
        else if(ch==3)
        {
            System.out.println("Wednesday");
        }
        else if(ch==4)
        {
            System.out.println("Thrusday");
        }
        else if(ch==5)
        {
            System.out.println("Friday");
        }
        else if(ch==6)
        {
            System.out.println("Saturday");
        }
        else if(ch==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("There are only 7 days in a Week");
        }
    }
}
