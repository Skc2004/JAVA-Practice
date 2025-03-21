class ProcessThread extends Thread {
    public ProcessThread(String name) {
        super(name);  // Set the thread name
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
}

public class prg10 {
    public static void main(String[] args) {
        // Create 5 threads representing different processes
        ProcessThread process1 = new ProcessThread("Process 1");
        ProcessThread process2 = new ProcessThread("Process 2");
        ProcessThread process3 = new ProcessThread("Process 3");
        ProcessThread process4 = new ProcessThread("Process 4");
        ProcessThread process5 = new ProcessThread("Process 5");

        // Set different priorities for each process
        process1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        process2.setPriority(3);                   // Priority 3
        process3.setPriority(Thread.NORM_PRIORITY); // Priority 5
        process4.setPriority(8);                   // Priority 8
        process5.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start the threads
        process1.start();
        process2.start();
        process3.start();
        process4.start();
        process5.start();

        // Ensure the main thread waits for all threads to complete
        try {
            process1.join();
            process2.join();
            process3.join();
            process4.join();
            process5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All processes have completed execution.");
    }
}
