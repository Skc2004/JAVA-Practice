import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prg7  {
    public static void main(String[] args) {
        // List of integers to square
        List<Integer> numbersToSquare = Arrays.asList(1, 2, 3, 4);

        // Anonymous function to square each element in the list
        List<Integer> squaredNumbers = numbersToSquare.stream()
                .map(n -> n * n) // Lambda expression to square each number
                .collect(Collectors.toList()); // Collect the results into a list

        // Print the squared numbers
        System.out.println("Squared Numbers: " + squaredNumbers);

        // List of integers to filter even numbers
        List<Integer> numbersToFilter = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Anonymous function to filter even numbers from the list
        List<Integer> evenNumbers = numbersToFilter.stream()
                .filter(n -> n % 2 == 0) // Lambda expression to filter even numbers
                .collect(Collectors.toList()); // Collect the results into a list

        // Print the even numbers
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
