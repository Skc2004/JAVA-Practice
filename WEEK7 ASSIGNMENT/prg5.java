class UserThread extends Thread {
    public UserThread(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("User Thread: " + Thread.currentThread().getName() + " - Iteration: " + i);
            try {
                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("User Thread interrupted.");
            }
        }
    }
}

public class prg5 {
    public static void main(String[] args) {
        // Creating a user-defined thread
        UserThread userThread = new UserThread("UserThread");

        // Creating an anonymous thread from the main method
        Thread mainThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread: " + Thread.currentThread().getName() + " - Iteration: " + i);
                try {
                    // Sleep for 1 second (1000 milliseconds)
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Main Thread interrupted.");
                }
            }
        });

        // Starting both threads at the same time
        userThread.start();
        mainThread.start();

        // Ensuring main thread completes before exiting
        try {
            userThread.join(); // Wait for user thread to finish
            mainThread.join(); // Wait for main thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main method interrupted.");
        }

        System.out.println("Both threads have completed execution.");
    }
}
