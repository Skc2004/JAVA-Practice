import java.util.Scanner;

public class Rectangle 
{
    public double height;
    public double width;

    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public double area()
    {
        return height * width;
    }

    public double perimeter()
    {
        return 2*(height+width);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height =sc.nextDouble();
        System.out.print("Enter the width: ");
        double width= sc.nextDouble();
        Rectangle obj= new Rectangle(height, width);
        System.out.println("Area of Rectangle: "+obj.area());
        System.out.println("Perimeter of Rectangle: "+obj.perimeter());
        sc.close();
    }
}
