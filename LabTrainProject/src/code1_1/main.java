package code1_1;

public class main {
    public static void main(String[] args) {
        int a  = 1;
        Integer i1 = new Integer(a); // 手动
        Integer i2 = a;

        int b = i1.intValue();   // 手动
        int c = i1;  // 自动

        byte by = i1.byteValue();
        System.out.println(i1.toString());

        String str = "123";
        int i_str = Integer.parseInt(str);  // 类型转换
        System.out.println(i_str);

    }
}
