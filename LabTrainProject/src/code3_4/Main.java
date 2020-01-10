package code3_4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3) {
            @Override
            public double computePerimeter(double w, double h) {
                return 2 * (w + h);
            }
        };
        Circle circle = new Circle(2);
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
        System.out.println(circle.getArea() + " " + circle.getPerimeter());
    }
}
