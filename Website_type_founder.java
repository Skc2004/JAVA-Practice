import java.util.Scanner;
public class Website_type_founder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Url of the website whose type is to be found :- ");
        String url=sc.nextLine();
        int flag=0;
        flag=url.lastIndexOf('.');
        if(url.substring(flag).equals(".com"))
        {
            System.out.println("The given Url is of a Commercial Website.");
        }
        else if(url.substring(flag).equals(".org"))
        {
            System.out.println("The given Url is of an Organization Website.");
        }
        else if(url.substring(flag).equals(".in"))
        {
            System.out.println("The given Url is of an Indian Website.");
        }
        else
        {
            System.out.println("Invalid Website!!!!!");
        }
    }
}
