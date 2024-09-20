abstract class Animal 
{
    public abstract void sound();
    public abstract void eat();
}

class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Barking");
    }

    public void eat()
    {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal
{
    public void sound()
    {
        System.out.println("Meowing");
    }

    public void eat()
    {
        System.out.println("Cat is eating");
    }
}

class Bird extends Animal
{
    public void sound()
    {
        System.out.println("Chirping");
    }

    public void eat()
    {
        System.out.println("Bird is eating");
    }
}

public class Animals
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
        bird.sound();
        bird.eat();
    }
}
