import java.util.Scanner;

public class Solution_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in: ");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

//        Scanner sc =new Scanner(System.in);
//        int q=sc.nextInt();
//        float []arr =new float[q];
//        String [] arr1 = new String[q];
//        for(int i=0;i<q;i++)
//        {
//            arr1[i]=sc.next();
//            arr[i]=Float.parseFloat(arr1[i]);
//        }
//        for (int i=0;i<q;i++)
//        {
//            if ((arr[i]<(float) Integer.MIN_VALUE || arr[i]>(float) Integer.MAX_VALUE) && (arr[i]<(float)Byte.MIN_VALUE || arr[i]>(float)Byte.MAX_VALUE) && (arr[i]<(float)Short.MIN_VALUE || arr[i]>(float)Short.MAX_VALUE) && (arr[i]< -9223372036854775808f || arr[i]>9223372036854775807f ))
//            {
//                System.out.println(arr1[i]+" can't be fitted anywhere.");
//            }
//            else
//            {
//                System.out.println(arr1[i]+" can be fitted in:");
//                if (arr[i]>=(float)Byte.MIN_VALUE && arr[i]<=(float)Byte.MAX_VALUE)
//                {
//                    System.out.println("* byte");
//                }
//                if (arr[i]>=(float)Short.MIN_VALUE && arr[i]<=(float)Short.MAX_VALUE)
//                {
//                    System.out.println("* short");
//                }
//                if (arr[i]>=(float)Integer.MIN_VALUE && arr[i]<=(float)Integer.MAX_VALUE)
//                {
//                    System.out.println("* int");
//                }
//                if (arr[i]> -9223372036854775808f && arr[i]<=9223372036854775807f)
//                {
//                    System.out.println("* long");
//                }
//            }
//        }
    }
}


