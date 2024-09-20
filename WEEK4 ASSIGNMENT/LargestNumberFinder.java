import java.util.Random;
import java.util.Scanner;

public class LargestNumberFinder 
{

    
    public static int[] fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        System.out.print("Enter the minimum value for random numbers: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value for random numbers: ");
        int max = scanner.nextInt();

        
        while (max < min) {
            System.out.println("Maximum value must be greater than or equal to minimum value. Please enter again.");
            System.out.print("Enter the maximum value for random numbers: ");
            max = scanner.nextInt();
        }

        int[] numbers = new int[size];
        Random random = new Random();

        System.out.println("\nFilling the array with random numbers...");
        for (int i = 0; i < size; i++) {
            // Generate random number between min and max (inclusive)
            numbers[i] = random.nextInt((max - min + 1)) + min;
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }
        scanner.close();
        return numbers;
    }

    
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = fillArray();
        int largestNumber = findLargest(numbers);
        System.out.println("\nThe largest number in the array is: " + largestNumber);
    }
}
