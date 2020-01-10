package code3_2;

public class EatMeatAnimal extends Animal {
    private String meatType;  // 活的还是死的动物

    public EatMeatAnimal() {

    }

    public EatMeatAnimal(String name, double weight, boolean sex) {
        super.setName(name);
        super.setWeight(weight);
        super.setSex(sex);
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
}
