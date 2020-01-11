package code7_2;

public class PersonThread implements Runnable {
    private Bank bank;
    private String name;

    PersonThread() {

    }

    PersonThread(Bank bank, String name) {
        this.bank = bank;
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            bank.saveMoney2(1);
            System.out.println(name + "第" + (i + 1) + "次存钱 " + bank.getCount());
        }
    }
}
