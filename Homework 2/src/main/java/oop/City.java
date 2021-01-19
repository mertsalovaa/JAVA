package oop;

public class City {
    private String nameCity;
    private String nameCountry;

    public City(String nameCity, String nameCountry) {
        this.nameCity = nameCity;
        this.nameCountry = nameCountry;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return "City { " +
                "name = '" + getNameCity() + '\'' +
                ", country = " + getNameCountry() +
                " }";
    }
}
