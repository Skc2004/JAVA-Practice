import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        int i = 0;
        
        do {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
            i++;
        } while (i <= exponent);
        scanner.close();
    }
}