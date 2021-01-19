package oop;

public class Car {
    private String name;
    private String nameProduction;
    private int year;
    private int engineOfCapacity;

    public Car(String name, String nameProduction, int year, int engineOfCapacity) {
        this.name = name;
        this.nameProduction = nameProduction;
        this.year = year;
        this.engineOfCapacity = engineOfCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameProduction() {
        return nameProduction;
    }

    public void setNameProduction(String nameProduction) {
        this.nameProduction = nameProduction;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineOfCapacity() {
        return engineOfCapacity;
    }

    public void setEngineOfCapacity(int engineOfCapacity) {
        this.engineOfCapacity = engineOfCapacity;
    }

    @Override
    public String toString() {
        return "Car { " +
                "name = '" + name + '\'' +
                ", nameProduction = '" + nameProduction + '\'' +
                ", year = " + year +
                ", engineOfCapacity = " + engineOfCapacity +
                " }";
    }
}
