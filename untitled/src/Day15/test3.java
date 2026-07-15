package Day15;

class SharedData {
    private int data;
    private boolean available = false;

    public synchronized void produce(int data) throws InterruptedException {

        while (available) {
            wait();
        }

        this.data = data;
        available = true;

        System.out.println("Produced : " + data);

        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {

        while (!available) {
            wait();
        }

        int value = data;
        available = false;

        System.out.println("Consumed : " + value);

        notifyAll();
    }
}

class Producer extends Thread {

    private SharedData sd;

    public Producer(SharedData sd) {
        this.sd = sd;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                sd.produce(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {

    private SharedData sd;

    public Consumer(SharedData sd) {
        this.sd = sd;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                sd.consume();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class test3 {

    public static void main(String[] args) {

        SharedData sd = new SharedData();

        Producer p = new Producer(sd);
        Consumer c = new Consumer(sd);

        p.start();
        c.start();
    }
}