import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final SharedData sharedData;

    public RandomNumberGenerator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100); // Generate random integer between 0 and 99
            sharedData.setNumber(number);
            System.out.println("Generated: " + number);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class EvenNumberHandler extends Thread {
    private final SharedData sharedData;

    public EvenNumberHandler(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedData.getNumber();
            if (number % 2 == 0) {
                System.out.println("Even Square: " + (number * number));
            }
            try {
                Thread.sleep(500); // Sleep for half a second to prevent busy-waiting
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class OddNumberHandler extends Thread {
    private final SharedData sharedData;

    public OddNumberHandler(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedData.getNumber();
            if (number % 2 != 0) {
                System.out.println("Odd Cube: " + (number * number * number));
            }
            try {
                Thread.sleep(500); // Sleep for half a second to prevent busy-waiting
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SharedData {
    private int number;

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    public synchronized int getNumber() {
        return number;
    }
}

public class prg1 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        RandomNumberGenerator generator = new RandomNumberGenerator(sharedData);
        EvenNumberHandler evenHandler = new EvenNumberHandler(sharedData);
        OddNumberHandler oddHandler = new OddNumberHandler(sharedData);

        generator.start();
        evenHandler.start();
        oddHandler.start();
    }
}
