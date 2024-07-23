import java.util.Scanner;
public class Grading_System 
{
    static int score;

    static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the score: ");
        score = sc.nextInt();
        sc.close();
    }

    static void check()
    {
        int ch=score/10;
        switch(ch)
        {
            case 9:
            {
                System.out.println("A");
                break;
            }
            case 8:
            {
                System.out.println("B");
                break;
            }
            case 7:
            {
                System.out.println("C");
                break;
            }
            case 6:
            {
                System.out.println("D");
                break;
            }
            case 5,4,3,2,1,0:
            {
                System.out.println("F");
                break;
            }
            default:
            {
                System.out.println("Invalid score!");
                break;
            }
        }
    }

    public static void main(String args[])
    {
        input();
        check();
    }
}
