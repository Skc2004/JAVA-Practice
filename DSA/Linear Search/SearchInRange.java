import java.util.Scanner;


public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search:");
        int target = sc.nextInt();
        System.out.print("Enter the lower bound:");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound:");
        int upper = sc.nextInt();
        boolean search=searchRange(arr,target,lower,upper);
        System.out.println(search);
    }

    static boolean searchRange(int[] arr, int target,int lower, int upper)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i = lower;i<=upper;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}
