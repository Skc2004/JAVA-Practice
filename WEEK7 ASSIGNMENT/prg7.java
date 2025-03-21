class ThreadA extends Thread {
    private String input;
    private int dc = 0;  // Variable to store digit count

    public ThreadA(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        // Find the number of digits in the string
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                dc++;
            }
        }
        // Output format: ThreadA:digitscount
        System.out.println("ThreadA:" + dc);
    }
}

class ThreadB extends Thread {
    private String input;
    private int cc = 0;  // Variable to store alphabet count

    public ThreadB(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        // Find the number of alphabetic characters in the string
        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                cc++;
            }
        }
        // Output format: ThreadB:alphabetcount
        System.out.println("ThreadB:" + cc);
    }
}

public class prg7 {
    public static void main(String[] args) {
        // Input string k
        String k = "Hello123World456";

        // Create ThreadA to find the digit count
        ThreadA threadA = new ThreadA(k);
        
        // Create ThreadB to find the alphabetic character count
        ThreadB threadB = new ThreadB(k);

        // Start both threads
        threadA.start();
        threadB.start();

        // Wait for both threads to complete
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have completed execution.");
    }
}
