import java.util.Scanner;

public class For3 
{
      int input;
      
      void input()
      {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        input=sc.nextInt();
        sc.close();
      }

      void display()
      {
        System.out.println("The even numbers is :- ");
        for(int i=1;i<=input;i++)
        {
            if(i%2==0)
            {
            System.out.println(i);
            }
        }
      }

      public static void main(String args[])
      {
        For3 obj=new For3();
        obj.input();
        obj.display();
      }
}
