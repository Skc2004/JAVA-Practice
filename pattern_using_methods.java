public class pattern_using_methods
{
    public static void pattern()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("The pattern is as follows :- ");
        pattern();
    }
}
