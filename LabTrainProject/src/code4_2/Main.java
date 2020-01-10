package code4_2;

public class Main {
    public static void main(String[] args) {
        MakeException makeException = new MakeException();

        try {
            makeException.makeMyException();
        } catch (SubMyException se) {
            System.out.println("se-->" + se.getMessage());

            se.printStackTrace();
        } catch (MyException e) {
            System.out.println("e-->" + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("被执行");

    }
}
