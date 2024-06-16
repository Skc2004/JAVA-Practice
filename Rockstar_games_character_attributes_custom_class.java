import java.util.Scanner;
class TommyVecetti
{
    void hitting()
    {
        System.out.println("Tommy Vecetti is Capable of Hitting people !!!!!!");
    }
    void running()
    {
        System.out.println("Tommy Vecetti is Capable of Running Fast !!!!!!");
    }
    void firing()
    {
        System.out.println("Tommy Vecetti is Capable of Firing all the weapons !!!!!!");
    }
}
public class Rockstar_games_character_attributes_custom_class
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TommyVecetti obj=new TommyVecetti();
        System.out.println("Welcome to Rockstar Games");
        System.out.println("-------------------------");
        System.out.println("Choose any of the abilities of Tommy Vecetti for display :- ");
        System.out.println("1. Hitting People");
        System.out.println("2. Running Fast");
        System.out.println("3. Firing Weapons");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            {
                obj.hitting();
                break;
            }
            case 2:
            {
                obj.running();
                break;
            }
            case 3:
            {
                obj.firing();
                break;
            }
            default:
            {
                System.out.println("Wrong Choice !!!!");
                break;
            }
        }

    }
}
