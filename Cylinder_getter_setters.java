import java.util.Scanner;
class cylinder
{
    static double radius;
    static double height;
    static void setradius(double x)
    {
        radius=x;
    }
    static double getradius()
    {
        return radius;
    }
    static void setheight(double y)
    {
        height=y;
    }
    static double getheight()
    {
        return height;
    }
}
public class Cylinder_getter_setters
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder :- ");
        double r=sc.nextDouble();
        System.out.println("Enter the height of the cylinder :- ");
        double h=sc.nextDouble();
        cylinder.setradius(r);
        cylinder.setheight(h);
        System.out.println("The radius is : "+ cylinder.getradius());
        System.out.println("The height is : "+ cylinder.getheight());
    }
}
