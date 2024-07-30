import java.util.Scanner;

public class While5 
{
    public static void main(String args[])
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number = sc.nextInt();
        sc.close();

        int i=1;
        while(i<=number)
        {
            System.out.println(i);
            i++;
        }

    }    
}

