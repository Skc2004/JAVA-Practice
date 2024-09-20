abstract class Animal {
    String name;


    public Animal(String name) {
        this.name = name;
    }


    abstract void makeSound();
}


class Mammal extends Animal {


    public Mammal(String name) {
        super(name);
    }


    @Override
    void makeSound() {
        System.out.println(name + " says: Roar!");
    }
}

class Bird extends Animal {


    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}


class Fish extends Animal {


    public Fish(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Blub!");
    }
}


public class Animals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Mammal("Lion");
        animals[1] = new Bird("Sparrow");
        animals[2] = new Fish("Goldfish");

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

