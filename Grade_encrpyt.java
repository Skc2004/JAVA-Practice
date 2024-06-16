import java.util.Scanner;
public class Grade_encrpyt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade to be encrypted :- ");
        char a=sc.next().charAt(0);
        int x= (int)a;
        x=x+8;
        System.out.println("The correct grade is : " + (char)x);
    }
}
