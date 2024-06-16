import java.util.Scanner;
public class CGPA_of_three_subjects
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 1st Subject out of 100 :- ");
        int s1=sc.nextInt();
        System.out.println("Enter the marks of 2nd Subject out of 100 :- ");
        int s2=sc.nextInt();
        System.out.println("Enter the marks of 3rd Subject out of 100 :- ");
        int s3=sc.nextInt();
        double cgpa=((s1+s2+s3)/30);
        System.out.println("The CGPA is : "+cgpa);
    }
}
