import java.util.Scanner;
public class Find_given_integer_in_the_given_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        System.out.println("Enter "+ n+ " integer elements of the array :- ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched :- ");
        int num=sc.nextInt();
        int flag=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]==num)
            {
                flag++;
                break;
            }
        }
        if(flag>0)
        {
            System.out.println("The search was successful. The required integer is present !! ");
        }
        else
        {
            System.out.println("The search was unsuccessful. The required integer is not present !! ");
        }
    }
}
