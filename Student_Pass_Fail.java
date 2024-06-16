import java.util.Scanner;
public class Student_Pass_Fail
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student :- ");
        String name=sc.nextLine();
        System.out.println("Enter your marks in Maths out of 100 :- ");
        double maths=sc.nextDouble();
        System.out.println("Enter your marks in English out of 100 :- ");
        double english=sc.nextDouble();
        System.out.println("Enter your marks in Science out of 100 :- ");
        double science=sc.nextDouble();
        double total_percentage=(maths + english + science)/3;
        if(maths>=33.0 && english>=33.0 && science>=33.0 && total_percentage>=40.0 )
        {
            System.out.println(name + " is pass with "+ total_percentage +"% marks");
        }
        else
        {
            System.out.println(name + " is fail with "+ total_percentage +"% marks");
        }
    }
}
