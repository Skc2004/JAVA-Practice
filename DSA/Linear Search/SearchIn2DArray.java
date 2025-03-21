import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int row = sc.nextInt();
        System.out.print("Enter the number of column:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to search:");
        int target = sc.nextInt();
        System.out.println(search(arr,target,row));
    }

    static boolean search(int arr[][], int target,int row)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
