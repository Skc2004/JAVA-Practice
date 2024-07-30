import java.util.Scanner;

public class DoWhile4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();

        // Check if the entered number is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            int i = 1;
            long factorial = 1;

            do {
                factorial *= i;
                i++;
            } while (i <= number);

            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        scanner.close();
    }
}
