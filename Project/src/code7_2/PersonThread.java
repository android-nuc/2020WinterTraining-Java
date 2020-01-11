package code7_2;

public class PersonThread implements Runnable {
    private Bank bank;  // 同一个银行
    private String person_name;
    PersonThread(Bank bank, String person_name){
        this.person_name = person_name;
        this.bank = bank;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            bank.saveOneBlock(1);
            System.out.println(person_name + " 当前存钱次数：" + i + " 银行总存款：" + bank.getCount());
        }
    }
}
