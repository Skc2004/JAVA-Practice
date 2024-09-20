abstract class Shape
{
    public abstract double Area();
    public abstract double Perimeter();
}

class Circle extends Shape
{
    int radius;
    Circle(int r)
    {
        radius = r;
    }
    public double Area()
    {
        return radius*radius;
    }
    public double Perimeter()
    {
        return 2*3.14*radius;
    }
}

class Rectangle extends Shape
{
    int length,width;
    Rectangle(int l,int w)
    {
        length = l;
        width = w;
    }
    public double Area()
    {
        return length*width;
    }
    public double Perimeter()
    {
        return 2*(length+width);
    }
}

class Triangle extends Shape
{
    int height,base,side1,side2;
    Triangle(int h,int b,int s1,int s2)
    {
        height=h;
        base=b;
        side1=s1;
        side2=s2;
    }
    public double Area()
    {
        return (height*base)/2;
    }
    public double Perimeter()
    {
        return base+side1+side2;
    }
}

public class Shapes
{
    public static void main(String args[])
    {
        Circle c=new Circle(5);
        System.out.println("Area of Circle: "+c.Area());
        System.out.println("Perimeter of Circle: "+c.Perimeter());
        Rectangle r=new Rectangle(5,6);
        System.out.println("Area of Rectangle: "+r.Area());
        System.out.println("Perimeter of Rectangle: "+r.Perimeter());
        Triangle t= new Triangle(10, 8, 7, 6);
        System.out.println("Area of Triangle: "+t.Area());
        System.out.println("Perimeter of Triangle: "+t.Perimeter());
    }
}
