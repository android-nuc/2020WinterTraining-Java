package code3_4;

public class Circle implements Shape, ShapeCircle {
    private double r;
    private double area, perimeter;

    Circle() {

    }

    Circle(double r) {
        this.r = r;
        area = computeArea(r);
        perimeter = computePerimeter(r);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double computeArea(double w, double h) {
        return 0;
    }

    @Override
    public double computeArea(double r) {
        return 3.14 * r * r;
    }

    @Override
    public double computePerimeter(double w, double h) {
        return 0;
    }

    @Override
    public double computePerimeter(double r) {
        return 2 * 3.14 * r;
    }
}
