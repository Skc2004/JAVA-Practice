class Rectangle {
    // Private instance variables
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Default constructor
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display the details of the rectangle
    public void displayRectangleInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}


public class Rectangles {
    public static void main(String[] args) {
        // Create a Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        rect1.displayRectangleInfo();

        // Modify the length and width using setter methods
        rect1.setLength(7.5);
        rect1.setWidth(4.0);
        System.out.println("\nAfter modifying length and width:");
        rect1.displayRectangleInfo();

        // Create a Rectangle object using the default constructor
        Rectangle rect2 = new Rectangle();
        System.out.println("\nDefault Rectangle:");
        rect2.displayRectangleInfo();

        // Set length and width for the default rectangle
        rect2.setLength(6.0);
        rect2.setWidth(2.5);
        System.out.println("\nAfter setting length and width:");
        rect2.displayRectangleInfo();
    }
}
