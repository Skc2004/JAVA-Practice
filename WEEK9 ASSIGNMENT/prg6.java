import java.util.function.BiFunction;

public class prg6 {
    public static void main(String[] args) {
        // Anonymous function to add two numbers using BiFunction
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int sum = add.apply(5, 3); // Call the add function with 5 and 3
        System.out.println("Sum of 5 and 3 is: " + sum);

        // Anonymous function to multiply two numbers and assign it to a variable
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        
        // Call the multiply function with the values 4 and 6 and print the result
        int product = multiply.apply(4, 6);
        System.out.println("Product of 4 and 6 is: " + product);
    }
}

