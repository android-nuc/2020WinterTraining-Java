package code4_1;

public class Main {
    public static void main(String[] args) {
        MakeException makeException = new MakeException();
        try {
            System.out.println("try");
            makeException.makeMyException();
        } catch (SubMyException se) {
            System.out.println("se catch:" + se.getMessage());
            se.printStackTrace();
        } catch (MyException e) {
            System.out.println("e catch:" + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("被执行了");
        }
    }
}
