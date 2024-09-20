public class Person {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not provided";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a Person object using the default constructor
        Person person1 = new Person();
        
        // Creating a Person object using the parameterized constructor
        Person person2 = new Person("John Doe", 30, "123 Main St");

        // Displaying information for both objects
        System.out.println("Person 1 Information:");
        person1.displayPersonInfo();

        System.out.println("Person 2 Information:");
        person2.displayPersonInfo();
    }
}
