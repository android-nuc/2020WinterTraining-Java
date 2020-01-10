package code5_1;

public class Main {

//    public static double getNum(double num) {
//        return num;
//    }

    public static <T, Y, U> void getNum(T A, Y B, U C) {
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    public static void main(String[] args) {
//        getNum("123", 1, 1.0f);
        Shape shape1 = new Shape("123");
        System.out.println(shape1.getTemp());
        Shape shape2 = new Shape(1.0f);
        System.out.println(shape2.getTemp());
    }
}
