import java.util.Scanner;

public class Solution_5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String a1=sc.nextLine();
        String b=sc.next();
        String b1=sc.nextLine();
        String c=sc.next();
        String c1=sc.nextLine();
        String a2,b2,c2;
        a2=a1.trim();
        b2=b1.trim();
        c2=c1.trim();
        String a3,b3,c3;
        a3=a2;
        b3=b2;
        c3=c2;
        if(a3.length()==2)
        {
            a3="0"+a3;
        }
        else if (a3.length()==1)
        {
            a3="00"+a3;
        }
        if(b3.length()==2)
        {
            b3="0"+b3;
        }
        else if (b3.length()==1)
        {
            b3="00"+b3;
        }
        if(c2.length()==2)
        {
            c3="0"+c3;
        }
        else if (c3.length()==1)
        {
            c3="00"+c3;
        }
        int x=a.length();
        int y=b.length();
        int z=c.length();
        int x1=16-x;
        int y1=16-y;
        int z1=16-z;
        for(int j=1;j<=32;j++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.print(a);
        for (int i=1;i<x1;i++)
        {
            System.out.print(" ");
        }
        System.out.println(a3);
        System.out.print(b);
        for (int i=1;i<y1;i++)
        {
            System.out.print(" ");
        }
        System.out.println(b3);
        System.out.print(c);
        for (int i=1;i<z1;i++)
        {
            System.out.print(" ");
        }
        System.out.println(c3);
        for(int j=1;j<=32;j++)
        {
            System.out.print("=");
        }
        System.out.println();
    }
}
