package code7_2;

public class Bank {
    private int count = 0;
    private Object object;

    Bank() {

    }

    Bank(Object o) {
        object = o;
    }

    public int getCount() {
        return count;
    }

    public synchronized void saveOne(int money) {
        count += money;
    }

    public void saveOneBlock(int money) {
        synchronized (object) {
            count += money;
        }
    }


}
