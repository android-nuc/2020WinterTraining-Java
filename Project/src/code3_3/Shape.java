package code3_3;

public abstract class Shape {

    public abstract double computeArea();

    public double getArea() {
        return computeArea();
    }
}
