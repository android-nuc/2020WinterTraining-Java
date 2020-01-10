package code5_2;

public class Shape<T> {
    private T temp;

    Shape() {

    }

    Shape(T temp) {
        this.temp = temp;
    }

    public void setTemp(T temp) {
        this.temp = temp;
    }

    public T getTemp() {
        return this.temp;
    }

}
