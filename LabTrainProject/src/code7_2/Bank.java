package code7_2;

public class Bank {
    private int count;
    private Object object;

    Bank() {

    }

    Bank(Object o) {
        object = o;
    }

    public synchronized void saveMoney(int money) {
        count += money;
    }

    public void saveMoney2(int money) {
        synchronized (object) {
            count += money;
        }
    }

    public int getCount() {
        return count;
    }
}
