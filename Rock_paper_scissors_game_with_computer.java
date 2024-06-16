import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissors_game_with_computer
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE ROCK, PAPER AND SCISSORS WITH NONE OTHER THAN CPU :)");
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Enter your choice from the following :- ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int userInput=sc.nextInt();
        Random random=new Random();
        int compInput=random.nextInt(4);
        if(userInput==compInput)
        {
            System.out.println("DRAW");
        }
        else
        {
            if((userInput==1 && compInput==3) || (userInput==2 && compInput==1) || (userInput==3 && compInput==2))
            {
                System.out.println("YOU WIN !!");
            }
            else
            {
                System.out.println("You Loose !!");
            }
        }
        System.out.println("Computer choice : "+compInput);
    }
}
