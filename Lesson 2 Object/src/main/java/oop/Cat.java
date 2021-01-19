package oop;

public class Cat extends Animal {
    private int age;
    private int height;

    public Cat(int age, int height) {
        super();
        this.age = age;
        this.height = height;
    }

    public Cat(String name, int age, int height) {
        super(name);
        this.age = age;
        this.height = height;
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat { " +
                "name=" + this.getName() +
                ", age=" + age +
                ", height=" + height +
                " }";
    }
}
