class BaseThread extends Thread {
    @Override
    public void run() {
        try {
            // Simulating some task in the base thread
            System.out.println("BaseThread is running.");
            Thread.sleep(500);  // Sleep for 500 milliseconds (0.5 seconds)
        } catch (InterruptedException e) {
            System.out.println("BaseThread was interrupted.");
        }
    }
}

class ExtendedThread extends BaseThread {
    @Override
    public void run() {
        try {
            System.out.println("ExtendedThread is running.");

            // Sleep for 10 nanoseconds
            System.out.println("Sleeping for 10 ns.");
            Thread.sleep(0, 10);  // Sleep for 10 nanoseconds

            // Sleep for 20 nanoseconds
            System.out.println("Sleeping for 20 ns.");
            Thread.sleep(0, 20);  // Sleep for 20 nanoseconds

            // Sleep for 50 nanoseconds
            System.out.println("Sleeping for 50 ns.");
            Thread.sleep(0, 50);  // Sleep for 50 nanoseconds

            // Sleep for 70 nanoseconds
            System.out.println("Sleeping for 70 ns.");
            Thread.sleep(0, 70);  // Sleep for 70 nanoseconds

            // Sleep for 100 nanoseconds
            System.out.println("Sleeping for 100 ns.");
            Thread.sleep(0, 100);  // Sleep for 100 nanoseconds

        } catch (InterruptedException e) {
            System.out.println("ExtendedThread was interrupted.");
        }
    }
}

public class prg9 {
    public static void main(String[] args) {
        // Create and start a thread from the base class
        BaseThread baseThread = new BaseThread();
        baseThread.start();

        // Create and start a thread from the extended class
        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.start();

        // Ensure both threads complete their execution
        try {
            baseThread.join();
            extendedThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have completed execution.");
    }
}