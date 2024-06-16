import java.util.Scanner;
public class replace_space_with_underscores
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String str=sc.nextLine();
        str=str.replace( ' ','_');
        System.out.println("The resultant String is as follows :- ");
        System.out.println(str);
    }
}
