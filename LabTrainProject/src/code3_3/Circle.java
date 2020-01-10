package code3_3;

public class Circle extends Shape {
    private double r;

    public Circle() {

    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    protected double computeArea() {
        return 3.14 * r * r;
    }

    public double getArea(){
        return computeArea();
    }


}
