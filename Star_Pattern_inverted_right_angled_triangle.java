import  java.util.Scanner;
public class Star_Pattern_inverted_right_angled_triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
