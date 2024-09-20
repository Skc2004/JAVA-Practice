// Base class Animal
class Animal {
    String name;
    String sound;
    int num_legs;

    // Constructor
    public Animal(String name, String sound, int num_legs) {
        this.name = name;
        this.sound = sound;
        this.num_legs = num_legs;
    }

    // Method to make sound
    public void make_sound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    // Method to walk
    public void walk() {
        System.out.println(name + " walks on " + num_legs + " legs.");
    }
}

// Subclass Dog
class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name, "barks", 4);
    }

    // Override make_sound() method
    @Override
    public void make_sound() {
        System.out.println(name + " barks: Woof Woof!");
    }

    // Override walk() method
    @Override
    public void walk() {
        System.out.println(name + " walks on " + num_legs + " legs, wagging its tail.");
    }
}

// Subclass Cat
class Cat extends Animal {

    // Constructor
    public Cat(String name) {
        super(name, "meows", 4);
    }

    // Override make_sound() method
    @Override
    public void make_sound() {
        System.out.println(name + " meows: Meow Meow!");
    }

    // Override walk() method
    @Override
    public void walk() {
        System.out.println(name + " walks gracefully on " + num_legs + " legs.");
    }
}

// Subclass Bird
class Bird extends Animal {

    // Constructor
    public Bird(String name) {
        super(name, "chirps", 2);
    }

    // Override make_sound() method
    @Override
    public void make_sound() {
        System.out.println(name + " chirps: Tweet Tweet!");
    }

    // Override walk() method
    @Override
    public void walk() {
        System.out.println(name + " hops on " + num_legs + " legs and flies.");
    }
}


// Main class to test the implementation
public class Animals {
    public static void main(String[] args) {
        // Create objects of derived classes
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Tweety");

        // Demonstrate behavior
        dog.make_sound();
        dog.walk();

        cat.make_sound();
        cat.walk();

        bird.make_sound();
        bird.walk();
    }
}

