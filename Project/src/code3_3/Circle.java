package code3_3;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double computeArea() {

        return 3.14 * r * r;
    }
}
