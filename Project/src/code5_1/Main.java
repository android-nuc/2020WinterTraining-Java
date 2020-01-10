package code5_1;

public class Main {
    private static double max(double a, double b) {
        return a > b ? a : b;
    }

    private static <T extends Comparable> T max_T(T a, T b) {
        // 等于返回0，大于返回1，小于返回-1
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 2;
        Integer i3 = max_T(i1, i2);
        System.out.println(i3);
    }
}
