package code5_1;

public class Shape<T> {
    public T temp;

    Shape() {

    }

    Shape(T temp) {
        this.temp = temp;
    }

    public void setTemp(T temp){
        this.temp = temp;
    }

    public T getTemp(){
        return temp;
    }
}
