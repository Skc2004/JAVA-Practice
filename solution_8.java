import java.util.Scanner;
import java.lang.*;
public class solution_8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        String []arr=new String[q];
        int []a =new int[q];
        int []b =new int[q];
        int []n =new int[q];
        for(int i=0;i<q;i++)
        {
            arr[i]=sc.nextLine();
        }
        for (int j=0;j<q;j++)
        {
            int flag1,flag2;
            flag1=0; flag2=0;
            String x=arr[j];
            for(int i=0;i<x.length();i++)
            {
                if(x.charAt(i)==' ')
                {
                    a[j]=Integer.parseInt(x.substring(0,i));
                    flag1=i;
                    break;
                }
            }
            for(int i=flag1+1;i<x.length();i++)
            {
                if(x.charAt(i)==' ')
                {
                    b[j]=Integer.parseInt(x.substring(flag1+1,i));
                    flag2=i;
                    break;
                }
            }
            n[j]=Integer.parseInt(x.substring(flag2+1,x.length()));
        }
        for (int j=0;j<q;j++)
        {
            if(q>=0 && q<=500 && a[j]>=0 && b[j]>=0 && a[j]<=50 && b[j]<=50 && n[j]>=1 && n[j]<=15 )
            {
                int p = a[j];
                for (int i = 0; i < n[j]; i++) {
                    for (int k = 0; k <= i; k++) {
                        p = p + (int) ((Math.pow(2, k)) * b[j]);
                    }
                    System.out.print(p + " ");
                    p = a[j];
                }
                System.out.println();
            }
        }
    }
}