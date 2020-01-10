package code3_2;

public class Sheep extends EatPlantAnimal {
    private String plantFoodName;   //最常吃的植物

    public Sheep() {

    }

    public Sheep(String plantFoodName, String plantType, String name, double weight, boolean sex) {
        super(name, weight, sex);
        this.plantFoodName = plantFoodName;
        setPlantType(plantType);
    }

    public String toString() {
        return getName() + "--" + getWeight() + "--" + (isSex() ? "公" : "母") +
                "--" + getPlantType() + "--" + this.plantFoodName;
    }
}
