class SharedResource {
    private int value;
    private boolean isAvailable = false;

    public synchronized int consume() throws InterruptedException {
        while (!isAvailable) {
            wait(); // Wait until a value is produced
        }
        System.out.println("Consumed: " + value);
        isAvailable = false; // Mark the value as consumed
        notify(); // Notify the producer that a value has been consumed
        return value;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (isAvailable) {
            wait(); // Wait until the value is consumed
        }
        this.value = value;
        System.out.println("Produced: " + value);
        isAvailable = true; // Mark the value as available
        notify(); // Notify the consumer that a value is available
    }
}

class Producer extends Thread {
    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                sharedResource.produce(value++);
                Thread.sleep(1000); // Sleep for 1 second before producing the next value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sharedResource.consume();
                Thread.sleep(1500); // Sleep for 1.5 seconds before consuming the next value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class prg2 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}

