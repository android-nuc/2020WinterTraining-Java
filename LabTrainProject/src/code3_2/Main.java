package code3_2;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("青草", "草", "羊",
                102.2f, true);
        Lion lion = new Lion("羊", "活的", "狮子", 300.2f, true);
        System.out.println(sheep.toString());

    }
}
