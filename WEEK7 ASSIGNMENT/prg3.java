class SleepAndRenameThread extends Thread {
    @Override
    public void run() {
        System.out.println("Original Thread Name: " + getName());
        
        try {
            // Sleep for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted.");
        }

        // Change the name of the thread
        setName("Renamed Thread");
        System.out.println("New Thread Name: " + getName());
    }
}

public class prg3 {
    public static void main(String[] args) {
        SleepAndRenameThread thread = new SleepAndRenameThread();
        thread.start();
    }
}

