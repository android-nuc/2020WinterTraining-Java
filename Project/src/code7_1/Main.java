package code7_1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        System.out.println(myThread.getState());
        myThread.setName("myThread");
        System.out.println(myThread.getState() + "  " + myThread.getName() + "");
        Thread thread = new Thread(new MyRunnable());
        System.out.println(thread.getState());
        thread.run();
        System.out.println(thread.getState());
    }
}
