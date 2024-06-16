import java.util.Scanner;
class cellphone
{
    void ring()
    {
        System.out.println("Your Cellphone is ringing !!!!!!!");
    }
    void vibrate()
    {
        System.out.println("Your Cellphone is vibrating !!!!!!!!");
    }
}
public class cellphone_attributes_and_properties_custom_class
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose from the following options :- ");
        System.out.println("1. Your Phone is on Silent Mode ");
        System.out.println("2. Your Phone is on Normal Mode ");
        int n=sc.nextInt();
        cellphone obj=new cellphone();
        switch(n)
        {
            case 1:
            {
                obj.vibrate();
                break;
            }
            case 2:
            {
                obj.ring();
                break;
            }
        }
    }
}
