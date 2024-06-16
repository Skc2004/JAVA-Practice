import java.util.Scanner;
public class Addition_of_two_matrices_of_order_2x3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] []arr1=new int[2] [3];
        int [] []arr2=new int[2] [3];
        System.out.println("Enter the elements of the first matrix :- ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr1 [i] [j] =sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix :- ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2 [i] [j] =sc.nextInt();
            }
        }
        System.out.println("The first matrix is :- ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr1 [i] [j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The second matrix is :- ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr2 [i] [j]+" ");
            }
            System.out.println();
        }
        System.out.println("The resultant matrix after addition of the two given matrices is as follows ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr2 [i] [j]+ arr1 [i] [j] + " ");
            }
            System.out.println();
        }
    }
}
    