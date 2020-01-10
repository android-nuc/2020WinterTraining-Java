package code3_4;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double computeArea() {
        return 3.14 * r * r;
    }

    @Override
    public double computePerimeter() {
        return 2.0 * 3.14 * r;
    }

    public double getArea() {
        return computeArea();
    }

    public double getPerimeter() {
        return computePerimeter();
    }
}
