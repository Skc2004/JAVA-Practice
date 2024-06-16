
import java.io.IOException;
import java.util.Scanner;

public class Solution3
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        int c=a%2;
        if(c!=0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(a>=2 && a<=5)
            {
                System.out.println("Not Weird");
            }
            else if (a>=6 && a<=20)
            {
                System.out.println("Weird");
            }
            else if (a>20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}
