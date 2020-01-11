package code7_3;

public class Producer implements Runnable {
    private int contents;
    private boolean available = false;
    private Thread producer;
    private Thread consumer;

    public synchronized int get() {
        while (available == false) {
            try {
                wait(); //释放锁，等候producer放值
            } catch (InterruptedException e) {
            }
        }
        available = false;
        System.out.println("Consumer gets:" + contents);
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait(); //释放锁，等候consumer取值
            } catch (InterruptedException e) {
            }
        }
        contents = value;
        available = true;
        System.out.println("Producer produces:" + contents);
        notifyAll();
    }

    @Override
    public void run() {
        if (Thread.currentThread() == producer) {
            for (int i = 0; i <= 9; i++) put(i);
        } else {
            for (int i = 0; i <= 9; i++) get();
        }
    }

    Producer(){
        producer = new Thread(this);
        consumer = new Thread(this);
        producer.start();
        consumer.start();
    }

    public static void main(String[] args) {
        new Producer();
    }
}

