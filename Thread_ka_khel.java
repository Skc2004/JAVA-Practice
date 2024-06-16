class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        while(true)
        {
            System.out.println("Good Morning");
        }
    }

}
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome");
        }
    }
}
public class Thread_ka_khel
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
