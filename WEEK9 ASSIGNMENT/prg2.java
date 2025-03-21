import java.util.Scanner;

public class prg2 {

    // Pure function to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area = π * r^2
    }

    // Impure function to prompt the user for the radius and print the area
    public static void promptForArea() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter the radius of the circle: "); // Prompt the user
        double radius = scanner.nextDouble(); // Read the radius from user input
        double area = calculateArea(radius); // Call the pure function to calculate the area
        System.out.println("The area of the circle with radius " + radius + " is: " + area); // Print the result
        scanner.close(); // Close the scanner
    }

    public static void main(String[] args) {
        // Example usage of the pure function
        double testRadius = 5.0; // Example radius
        double area = calculateArea(testRadius); // Calculate the area using the pure function
        System.out.println("The area of the circle with radius " + testRadius + " is: " + area); // Print the area

        // Call the impure function to interact with the user
        promptForArea();
    }
}
