import java.util.Scanner;
public class MinimumNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min= Minimum(arr);
        System.out.println("Minimum number in the array is: "+min);
    }

    static int Minimum(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
