import java.util.Scanner;
public class Maximum_element_in_given_1D_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array :- ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the Integer Array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the given array is : "+max);
    }
}
