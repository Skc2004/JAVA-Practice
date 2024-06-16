public class Fountain_pen extends Pen
{
    public void write()
    {
        System.out.println("I can write.");
    }
    public void refill()
    {
        System.out.println("I need refill.");
    }
    public void change_nib()
    {
        System.out.println("Change my nib.");
    }

    public static void main(String[] args)
    {
        Fountain_pen obj= new Fountain_pen();
        obj.write();
        obj.refill();
        obj.change_nib();
    }
}
