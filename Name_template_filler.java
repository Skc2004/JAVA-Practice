import java.util.Scanner;
public class Name_template_filler
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :- ");
        String name= sc.nextLine();
        String str= "Dear name, Thanks a lot!";
        String result=str.replace("name",name);
        System.out.println(result);
    }
}
