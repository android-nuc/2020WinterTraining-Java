package code3_4;

public class Square extends Rectangle {
    private double w;

    public Square(double w) {
        super(w, w);
    }

    @Override
    public double computeArea() {
        return w * w;
    }
}
