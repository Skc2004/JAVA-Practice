class Monkey
{
    public void jump()
    {
        System.out.println("Monkey can jump");
    }
    public void bite()
    {
        System.out.println("Monkey does bite");
    }
}
interface BasicAnimal
{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println("I can eat");
    }
    public void sleep()
    {
        System.out.println("I can sleep");
    }
}
public class Monkey_Human_Basic_animal_abstract
{
    public static void main(String[] args)
    {
        Human obj=new Human();
        obj.jump();
        obj.bite();
        obj.eat();
        obj.sleep();
    }
}
