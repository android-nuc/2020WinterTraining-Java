package code3_2;

public class EatPlantAnimal extends Animal {
    private String plantType;   // 植物类型

    public EatPlantAnimal() {

    }

    public EatPlantAnimal(String name, double weight, boolean sex) {
        super.setName(name);
        super.setWeight(weight);
        super.setSex(sex);
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }
}
