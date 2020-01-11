package code7_2;

public class Main {

    public static void main(String[] args) {
        Object o = new Object();
        Bank bank = new Bank(o);
        PersonThread personThread1 = new PersonThread(bank, "小A");
        PersonThread personThread2 = new PersonThread(bank, "小B");
        Thread thread1 = new Thread(personThread1);
        Thread thread2 = new Thread(personThread2);
        thread1.setPriority(5);
        thread1.start();
        thread2.start();

//        0 5 10

        System.out.println(thread1.getName() + " " + thread1.getPriority() + " " + thread1.getState());
        System.out.println(thread2.getName() + " " + thread2.getPriority() + " " + thread2.getState());


//        Thread thread1 = new Thread(){
//            @Override
//            public void run() {
//                bank.saveMoney2(10);
//                System.out.println(bank.getCount());
//            }
//        };
//        Thread thread2 = new Thread(){
//            @Override
//            public void run() {
//                bank.saveMoney2(10);
//                System.out.println(bank.getCount());
//            }
//        };
//        thread1.start();
//        thread2.start();
    }
}
