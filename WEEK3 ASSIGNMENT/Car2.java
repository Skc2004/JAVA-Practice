public class Car2 {
    private String model;
    private int year;
    private String color;

    // Constructor to initialize the attributes
    public Car2(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating two Car2 objects
        Car2 car1 = new Car2("Toyota Camry", 2020, "Red");
        Car2 car2 = new Car2("Honda Accord", 2018, "Blue");

        // Displaying their information
        System.out.println("Car 1 Information:");
        car1.displayCarInfo();

        System.out.println("Car 2 Information:");
        car2.displayCarInfo();
    }
}
