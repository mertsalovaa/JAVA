import interfaces.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
        Scanner in = new Scanner(System.in);

//        sum(in);
//        sub(in);
//        mult(in);
        div(in);
    }

    public static void div(Scanner in) {
        DivFraction test = (x, y) -> {
            return x / y;
        };
        System.out.print("Enter num1 : ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = in.nextDouble();
        double res = test.div(num1, num2);
        System.out.println("Result: " + res);
    }

    public static void sum(Scanner in) {
        SumFraction test = (x, y) -> {
            return x + y;
        };
        System.out.print("Enter num1 : ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = in.nextDouble();
        double res = test.sum(num1, num2);
        System.out.println("Result: " + res);
    }

    public static void mult(Scanner in) {
        MultFraction test = (x, y) -> {
            return x * y;
        };
        System.out.print("Enter num1 : ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = in.nextDouble();
        double res = test.mult(num1, num2);
        System.out.println("Result: " + res);
    }

    public static void sub(Scanner in) {
        SubFraction test = (x, y) -> {
            return x - y;
        };
        System.out.print("Enter num1 : ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = in.nextDouble();
        double res = test.sub(num1, num2);
        System.out.println("Result: " + res);
    }

    public static void task1() {
        Year test = (x) -> {
            return year(x);
        };
        System.out.println("Enter year : ");
        Scanner in = new Scanner(System.in);
        String res = test.year(in.nextInt());
        System.out.println(res);
    }

    private static String year(int x) {
        String str = "";
        if (x % 4 == 0) {
            if (x % 100 != 0 || (x % 100 == 0 && x % 400 == 0)) {
                str = "Рік '" + x + "' є високосний ";
            }
        } else {
            str = "Рік '" + x + "' не високосний ";
        }
        return str;
    }
}
