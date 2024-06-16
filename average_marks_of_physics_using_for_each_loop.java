import java.util.Scanner;
public class average_marks_of_physics_using_for_each_loop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of students in class :- ");
        int n=sc.nextInt();
        double []marks=new double[n];
        System.out.println("Enter the physics marks of all the students one by one :- ");
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextDouble();
        }
        double sum=0.0;
        for(double element:marks)
        {
            sum=sum+element;
        }
        double avg=sum/n;
        System.out.println("The average marks is : "+ avg);
    }
}
