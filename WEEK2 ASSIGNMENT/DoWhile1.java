import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;
        
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= number);
        scanner.close();
        
        System.out.println("The sum of even numbers from 1 to " + number + " is: " + sum);
    }
}

