package code4_1;

public class TryDemo {
    public static void main(String[] args) {
        try {
            double d = 1 / 10;
        } catch (ArithmeticException se) {
            System.out.println("---");
            se.printStackTrace();
            System.out.println("---");
        } catch (RuntimeException re) {
            re.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally 被执行");
        }
        System.out.println("被执行");

    }
}
