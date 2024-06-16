import java.util.Scanner;
class square
{
    double side;
    double area;
    double perimeter;
    void area()
    {
        System.out.println("The area of square is : "+side*side+ " square units.");
    }
    void perimeter()
    {
        System.out.println("The perimeter of square is : "+4*side+ " units.");
    }
}
public class square_custom_class_to_initialize_attributes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        square obj=new square();
        System.out.println("Enter the length of side of square :- ");
        obj.side=sc.nextDouble();
        obj.area();
        obj.perimeter();
    }
}
