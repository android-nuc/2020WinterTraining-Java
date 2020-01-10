package code1_1;

// 包装类
public class Wrapper {
    public static void main(String[] args) {
        // 装箱：将基本类型转换成包装类
        int a = 1;
        Integer v1 = new Integer(a);    // 手动装箱
        Integer v2 = a;                 // 自动装箱

        // 拆箱：将包装类型转成基本类型
        int b = v1.intValue();      // 手动拆箱
        int c = v2;                 // 自动拆箱

        // 包装类用法一：本类型与其他类型转换
        Integer v3 = 3;
        System.out.println("v3-->" + v3);
        float f1 = v3.floatValue();
        System.out.println("f1-->" + f1);
        byte b1 = v3.byteValue();
        System.out.println("b1-->" + b1);
        String str1 = v3.toString();
        System.out.println("str1-->" + str1);
        System.out.println();

        // 包装类用法二：字符串和本类型以及基本类型之间的转换
        String str2 = "122";
        int i1 = Integer.parseInt(str1);
        System.out.println("i1-->" + i1);
        float f2 = Float.parseFloat(str2);
        System.out.println("f2-->" + f2);
        float f3 = 3.1f;
        String str_f2 = String.valueOf(f3);
        System.out.println("str_f2-->" + str_f2);

    }
}
