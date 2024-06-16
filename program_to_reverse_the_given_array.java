import java.util.Scanner;
public class program_to_reverse_the_given_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of Integer Array :- ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the integer array :- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The input Integer Array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr [i] +" ");
        }
        System.out.println();
        System.out.print("The reverse of Integer Array is : ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr [i] +" ");
        }
    }
}
