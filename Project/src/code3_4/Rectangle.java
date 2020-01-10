package code3_4;

public abstract class Rectangle implements Shape {
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double computePerimeter() {
        return 2.0 * (w + h);
    }
}
