class circle
{
    void naming(){
        System.out.println("Main circle, Main Baap Hoon!!");
    }
}
class Cylinder extends circle{
    void naming2()
    {
        System.out.println("Main cylinder, Main Beta hoon!!!!!!");
    }
}
public class Circle_ka_beta_cylinder {
    public static void main(String[] args) {
        Cylinder obj=new Cylinder();
        obj.naming();
        obj.naming2();
    }
}
