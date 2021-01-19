package oop;

public class AsianCat extends Cat {
    public AsianCat(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public String getAnimalName() {
        return "AsianCat";
    }

    @Override
    public String toString() {
        return "AsianCat { " +
                "name=" + this.getName() +
                ", age=" + this.getAge() +
                ", height=" + this.getHeight() +
                " }";
    }
}
