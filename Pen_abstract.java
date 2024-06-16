abstract class Pen
{
    abstract public void write();
    abstract public void refill();
}
public class Pen_abstract extends Pen
{
    public void write()
    {
        System.out.println("i can write bitch!!");
    }
    public void refill()
    {
        System.out.println("i need refill !!");
    }

    public static void main(String[] args)
    {
        Pen_abstract obj = new Pen_abstract();
        obj.write();
        obj.refill();
    }
}
