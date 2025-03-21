class Printer {
    private boolean isBusy = false;

    // Method to print a job, synchronized to ensure only one job is printed at a time
    public synchronized void printJob(String jobName) {
        while (isBusy) {
            try {
                // If the printer is busy, wait until it's free
                wait();
            } catch (InterruptedException e) {
                System.out.println("Printing interrupted");
            }
        }

        // Mark the printer as busy and simulate the printing process
        isBusy = true;
        System.out.println("Printing job: " + jobName);
        try {
            Thread.sleep(2000);  // Simulating time taken to print the job
        } catch (InterruptedException e) {
            System.out.println("Printing interrupted");
        }

        // Mark the printer as free once the job is printed
        isBusy = false;
        // Notify other waiting threads that they can now access the printer
        notify();
    }
}

class PrintJob extends Thread {
    private String jobName;
    private Printer printer;

    public PrintJob(String jobName, Printer printer) {
        this.jobName = jobName;
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printJob(jobName);
    }
}

public class prg6 {
    public static void main(String[] args) {
        // Shared printer object
        Printer sharedPrinter = new Printer();

        // Creating print job threads (they will all share the same printer)
        Thread job1 = new PrintJob("Job 1", sharedPrinter);
        Thread job2 = new PrintJob("Job 2", sharedPrinter);
        Thread job3 = new PrintJob("Job 3", sharedPrinter);

        // Starting the threads (jobs are started in order)
        job1.start();
        job2.start();
        job3.start();

        // Ensure all print jobs complete before exiting
        try {
            job1.join();
            job2.join();
            job3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All print jobs have been completed.");
    }
}
