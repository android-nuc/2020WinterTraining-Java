package code3_2;

public class Lion extends EatMeatAnimal {
    private String bestMeatFood;

    public Lion() {

    }

    public Lion(String bestMeatFood, String meatType, String name, float weight, boolean sex) {
        super(meatType, name, weight, sex);
        this.bestMeatFood = bestMeatFood;

    }

}
