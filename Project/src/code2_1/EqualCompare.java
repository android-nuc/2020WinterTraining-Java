package code2_1;

// equals与==对比
public class EqualCompare {
    public static void main(String[] args) {
        // 基本数据类型
        int a1 = 1;
        Integer a2 = 1;
        int b1 = 1;
        Integer b2 = 1;

        System.out.println(a1 == b1);
        System.out.println(a2.equals(b2));
        System.out.println();

        String s1 = "123";  // 存放在常量池
        String s11 = "123";
        String s2 = new String("123");  // 存放在堆中
        System.out.println(s1 == s11);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
