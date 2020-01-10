package code3_2;

public class EatPlantAniaml extends Animal {
    private String plantType;

    public EatPlantAniaml() {

    }

    public EatPlantAniaml(String plantType, String name, Float weight, boolean sex){
        super(name, weight, sex);
        this.plantType = plantType;


    }

    public String getPlantType() {
        return plantType;
    }
}
