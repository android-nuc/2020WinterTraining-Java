package code3_2;

public class EatMeatAnimal extends Animal {
    private String meatType;

    public EatMeatAnimal() {

    }

    public EatMeatAnimal(String meatType, String name, Float weight, boolean sex) {
        super(name, weight, sex);
        this.meatType = meatType;

    }

}
