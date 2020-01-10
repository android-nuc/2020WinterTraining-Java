package code3_4;

public abstract class Rectangle implements Shape, ShapeCircle {
    private double w, h;
    private double area, perimeter;

    public Rectangle() {

    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
        area = computeArea(w, h);
        perimeter = computePerimeter(w, h);
    }

    @Override
    public double computeArea(double w, double h) {
        return w * h;
    }

    @Override
    public double computeArea(double w) {
        return 0;
    }


    @Override
    public double computePerimeter(double w) {
        return 0;
    }

}
