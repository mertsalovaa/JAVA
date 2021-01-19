package oop;

public abstract class Animal {
    private String name;

    public Animal() {
        this.name = this.getAnimalName();
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getAnimalName();

}
