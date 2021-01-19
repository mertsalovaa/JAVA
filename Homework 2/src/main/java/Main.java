import oop.*;
import shape.Shape;
import shape.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
        Task6();
    }

    public static void Task1() {
        Human[] humans = new Human[2];
        humans[0] = new Human("Iryna", 16, "woman");
        humans[1] = new Human("Kate", 17, "woman");

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }
    }

    public static void Task2() {
        City[] cities = new City[2];
        cities[0] = new City("Rivne", "Ukraine");
        cities[1] = new City("Warsaw", "Poland");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }

    public static void Task3() {
        Country[] countries = new Country[2];
        countries[0] = new Country("Ukraine", 10000, 12500);
        countries[1] = new Country("Poland", 24200, 250541);

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void Task4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numerator : ");
        int numerator = in.nextInt();
        System.out.print("Enter denominator : ");
        int denominator = in.nextInt();
        Fraction fraction = new Fraction(numerator, denominator);
        System.out.println(fraction);
    }

    public static void Task5() {
        Book[] books = new Book[5];
        books[0] = new Book("Harry Potter", "J.K. Rolling", 1997, "Scholastic Press", "Fantasy", 870);
        books[1] = new Book("Harry Potter", "J.K. Rolling", 1997, "Scholastic Press", "Fantasy", 870);

        for (int i = 0; i < books.length; i++) {
            if(books[i]!=null) {
                System.out.println(books[i]);
            }
        }
    }

    public static void Task6() {
        Car[] cars = new Car[5];
        cars[0] = new Car("Toyota RAV4", "Toyota",2012, 2);
        cars[1] = new Car("BMW Z4", "BMW",2018, 2);

        for (int i = 0; i < cars.length; i++) {
            if(cars[i]!=null) {
                System.out.println(cars[i]);
            }
        }
    }
}
