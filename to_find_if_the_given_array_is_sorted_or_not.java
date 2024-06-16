import java.util.Scanner;
public class to_find_if_the_given_array_is_sorted_or_not
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the integer array :- ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the integer array :- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The entered array is :- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr [i]+" ");
        }
        System.out.println();
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag=false;
                break;
            }

        }
        if(flag==true)
        {
            System.out.println("The array is sorted !!!!!!!!");
        }
        else
        {
            System.out.println("The array is not sorted !!!!!!!!!!!!!!!!!!!");
        }
    }
}
