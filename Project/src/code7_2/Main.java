package code7_2;

public class Main {

    public static void main(String[] args) {
        Object object = new Object();
        Bank bank = new Bank(object);
        PersonThread personThread1 = new PersonThread(bank, "小A");
        PersonThread personThread2 = new PersonThread(bank, "小B");
        new Thread(personThread1).start();
        new Thread(personThread2).start();
    }

}
