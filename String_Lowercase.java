import java.util.Scanner;
public class String_Lowercase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to be converted to Lower Case :- ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        System.out.println("The String in Lower Case is as follows :-");
        System.out.println(str);
    }
}
