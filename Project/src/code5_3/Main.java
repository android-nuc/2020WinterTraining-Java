package code5_3;

public class Main {
    private static <T extends Father & Action> void eat(T person) {
        person.eat();
    }

    public static void main(String[] args) {
        Mother mother = new Mother();

    }
}

