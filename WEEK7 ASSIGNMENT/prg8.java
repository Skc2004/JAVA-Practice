import java.util.Scanner;

class UserThreadPriority extends Thread {
    static String k;  // Shared string variable for both threads
    static char c;    // Shared character variable for both threads

    public UserThreadPriority(String name) {
        super(name);  // Set the thread name
    }

    @Override
    public void run() {
        // Each thread performs a task and prints the thread name, string, and character
        System.out.println(getName() + " is running.");
        System.out.println(getName() + " - String: " + k + ", Character: " + c);
    }
}

public class prg8 {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        UserThreadPriority.k = scanner.nextLine();

        // Get the input character from the user
        System.out.print("Enter a character: ");
        UserThreadPriority.c = scanner.next().charAt(0);

        // Create two thread objects with specific names
        UserThreadPriority threadobj1 = new UserThreadPriority("ThreadA");
        UserThreadPriority threadobj2 = new UserThreadPriority("ThreadB");

        // Start both threads
        threadobj1.start();
        threadobj2.start();

        // Wait for both threads to finish execution
        try {
            threadobj1.join();
            threadobj2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have completed execution.");
        scanner.close();
    }
}
