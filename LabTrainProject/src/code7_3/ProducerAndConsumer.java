package code7_3;

public class ProducerAndConsumer implements Runnable {
    private Thread producer, consumer;
    private boolean available = true;
    private int content;

    private synchronized void put(int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        content = value;
        available = true;
        notifyAll();
        System.out.println("producer  produces:" + content);
    }

    private synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = content;
        available = false;
        System.out.println("consumer get:" + value);
        notifyAll();
        return value;
    }

    @Override
    public void run() {
        if (Thread.currentThread() == producer) {
            for (int i = 0; i < 10; i++) {
                put(i);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                int val = get();
                System.out.println(val);
            }
        }

    }

    ProducerAndConsumer() {
        producer = new Thread(this);
        consumer = new Thread(this);
        producer.start();
        consumer.start();
    }


    public static void main(String[] args) {
        new ProducerAndConsumer();
    }

}
