class prg4 extends Thread {
    public prg4(String name) {
        super(name); // Set the initial thread name
    }

    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is at: " + i);
            try {
                // Sleep for 6 seconds (6000 milliseconds)
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
            // Change the name of the thread for each iteration
            Thread.currentThread().setName("Thread-" + i);
        }
    }

    public static void main(String[] args) {
        prg4 thread = new prg4("InitialThread");
        thread.start();
    }
}
