package code1_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape shape = new Shape();
        System.out.println(rectangle instanceof Shape);

        Other other = new Other();
//        System.out.println(other instanceof Shape);
    }
}
