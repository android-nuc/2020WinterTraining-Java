package code4_1;

public class TryDemo {
    public static void main(String[] args) {
        try {
            double num = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("这里被执行了");
    }
}
