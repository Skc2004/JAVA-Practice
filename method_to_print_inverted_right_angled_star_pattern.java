public class method_to_print_inverted_right_angled_star_pattern
{
    void pattern()
    {
        for(int i=1;i<5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        method_to_print_inverted_right_angled_star_pattern ob =new method_to_print_inverted_right_angled_star_pattern();
        System.out.println("The pattern is as follows :- ");
        ob.pattern();
    }
}
