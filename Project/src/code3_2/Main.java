package code3_2;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("青草", "草", "羊", 78.9, true);
        System.out.println(sheep.toString());
        Lion lion = new Lion("羊", "动物", "狮子", 200.3, true);
        System.out.println(lion.toString());

    }
}
