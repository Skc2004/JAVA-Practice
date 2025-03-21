import java.util.Arrays;

public class prg3 {

    // Pure function to find the maximum value in a list of numbers
    public static int findMax(int[] numbers) {
        int max = numbers[0]; // Initialize max with the first element
        for (int number : numbers) { // Iterate through the array
            if (number > max) { // Check if current number is greater than max
                max = number; // Update max
            }
        }
        return max; // Return the maximum value
    }

    // Impure function to sort a list of numbers in ascending order
    public static void sortNumbers(int[] numbers) {
        Arrays.sort(numbers); // Sort the array in place (impure function)
        System.out.println("Sorted numbers: " + Arrays.toString(numbers)); // Print the sorted array
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2}; // Example list of numbers

        // Example usage of the pure function
        int maxValue = findMax(numbers); // Find the maximum value
        System.out.println("The maximum value in the list is: " + maxValue); // Print the maximum value

        // Call the impure function to sort the numbers
        sortNumbers(numbers); // Sort the array and print the result
    }
}
