
import java.util.Scanner;
public class CBSE_Board_Exam_Result
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO CBSE RESULT PERCENTAGE CALCULATION SYSTEM");
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("Enter your Name :- ");
        String name=sc.nextLine();
        System.out.println("Enter your Roll No. :- ");
        long Roll=sc.nextLong();
        System.out.println("Enter your marks in Maths out of 100 :- ");
        int s1=sc.nextInt();
        System.out.println("Enter your marks in English out of 100 :- ");
        int s2=sc.nextInt();
        System.out.println("Enter your marks in Physics out of 100 :- ");
        int s3=sc.nextInt();
        System.out.println("Enter your marks in Chemistry out of 100 :- ");
        int s4=sc.nextInt();
        System.out.println("Enter your marks in Computer out of 100 :- ");
        int s5=sc.nextInt();
        double marks=((s1+s2+s3+s4+s5)/5);
        System.out.println();
        System.out.println();
        System.out.println("Congrats " + name + " with Roll No.: "+ Roll + " you have got " + marks + " percentage. ");
    }
}
