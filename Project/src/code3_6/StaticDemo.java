package code3_6;

public class StaticDemo {

    static {
        System.out.println("1被执行");
    }
    private static void print(){
        System.out.println("3被执行");
    }

    public static void main(String[] args) {
        System.out.println("2被执行");
        print();
//        new StaticDemo();

    }

}
