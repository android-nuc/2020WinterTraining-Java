package code3_2;

public class Lion extends EatMeatAnimal {
    private String meatFoodName;    // 最常吃的动物

    public Lion() {

    }

    public Lion(String meatFoodName, String meatType, String name, double weight, boolean sex) {
        super(name, weight, sex);
        this.meatFoodName = meatFoodName;
        setMeatType(meatType);
    }

    public String toString() {
        return getName() + "--" + getWeight() + "--" + (isSex() ? "公" : "母") + getMeatType() + "--" + this.meatFoodName;
    }
}
