import java.util.Scanner;
class Rectangle
{
    double length;
    double breadth;
    double area;
    double perimeter;
    void area()
    {
        System.out.println("The area of the Rectangle is : "+length*breadth+" square units.");
    }
    void perimeter()
    {
        System.out.println("The perimeter of the Rectangle is : "+2*(length+breadth)+" units.");
    }
}
public class Rectangle_custom_class_to_initialize_attributes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Rectangle obj=new Rectangle();
        System.out.println("Enter the length and breadth of the Rectangle respectively :- ");
        obj.length=sc.nextDouble();
        obj.breadth=sc.nextDouble();
        obj.area();
        obj.perimeter();
        sc.close();
    }
}
