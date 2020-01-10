package code3_2;

public class Animal {
    private String name;
    private Float weight;
    private boolean sex;

    public Animal() {

    }

    public Animal(String name, Float weight, boolean sex) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;

    }

    public String getName() {
        return name;
    }

    public Float getWeight() {
        return weight;
    }

    public boolean isSex() {
        return sex;
    }
}
