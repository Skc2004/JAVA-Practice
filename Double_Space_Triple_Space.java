import java.util.Scanner;
public class Double_Space_Triple_Space
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String in which you want to detect double and triple spaces :- ");
        String str=sc.nextLine();
        int d=0;
        int t=0;
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ' && str.charAt(i+1)==' ')
            {
                d++;
            }
            if(str.charAt(i)==' ' && str.charAt(i+1)==' ' && str.charAt(i+2)==' ')
            {
                t++;
                d-=2;
            }
        }
        System.out.println("The number of Double spaces in the String are = "+ d);
        System.out.println("The number of Triple spaces in the String are = "+ t);
    }
}
