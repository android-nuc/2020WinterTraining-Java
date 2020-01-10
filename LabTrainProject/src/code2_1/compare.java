package code2_1;

public class compare {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = new Integer(1);
//        System.out.println(a == b);
//        System.out.println(a == c);
        String str1 = "123";
        String str2 = "123";
        String str3 = new String("123");
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

    }
}
