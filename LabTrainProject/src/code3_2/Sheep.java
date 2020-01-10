package code3_2;

public class Sheep extends EatPlantAniaml {
    private String bestPlantFood;

    public Sheep() {

    }

    public Sheep(String bestPlantFood, String plantType, String name, Float weight, boolean sex) {
        super(plantType, name, weight, sex);
        this.bestPlantFood = bestPlantFood;
    }

    public String toString() {
        return getName() + "--" + getWeight() + "--" +
                (isSex() ? "公" : "母") + "--" + getPlantType() + "--" + this.bestPlantFood;
    }
}
