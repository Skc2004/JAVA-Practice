import java.util.Scanner;
class cylinder1
{
    static double radius;
    static double height;
    static double sa;
    static double v;
    static void setradius(double x)
    {
        radius=x;
    }
    static void setheight(double y)
    {
        height=y;
    }
    static double getSurfaceArea()
    {
        sa=(2*3.14*radius*height)+(2*3.14*radius*radius);
        return sa;
    }
    static double getVolume()
    {
        v=3.14*radius*radius*height;
        return v;
    }
}
public class cylinder_getter_setters_surface_area_and_volume
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder :- ");
        double r=sc.nextDouble();
        System.out.println("Enter the height of the cylinder :- ");
        double h=sc.nextDouble();
        cylinder1.setradius(r);
        cylinder1.setheight(h);
        System.out.println("The Surface area of the Cylinder is : "+cylinder1.getSurfaceArea()+" square units.");
        System.out.println("The Volume of the Cylinder is : "+cylinder1.getVolume()+" cubic units.");
    }
}
