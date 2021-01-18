import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Task1();
//        Task2(in);
//        Task3(in);
//        Task4(in);
//        Task5(in);
//        Task6(in);
//        Task7(in);
//        Task8(in);
//        Task9(in);
//        Task11(in);
        Task12(in);

    }

    public static void Task1() {
        System.out.println("Task 1 ");
        System.out.println("\"Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\"\n\t\t\tSteve Jobs\n");
    }

    public static void Task2(Scanner in) {
        System.out.println("Task 2 ");
        System.out.print("Enter digit : ");
        int digit = in.nextInt();
        System.out.print("Enter percent : ");
        int percent = in.nextInt();
        int number = (digit * percent) / 100;
        System.out.println("Result -> " + number + "\n");
    }

    public static void Task3(Scanner in) {
        System.out.println("Task 3 ");
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = in.nextInt();
        System.out.println(num1 + "" + num2 + "" + "" + num3 + "\n");
    }

    public static void Task4(Scanner in) {
        System.out.println("Task 4 ");
        System.out.print("Enter number (6-digit number) : ");
        String originalString = in.next();
        if (originalString.length() == 6) {
            char[] c = originalString.toCharArray();
            char temp1 = c[0];
            c[0] = c[5];
            c[5] = temp1;
            char temp2 = c[1];
            c[1] = c[4];
            c[4] = temp2;
            String swappedString = new String(c);
            System.out.println(swappedString);
        } else {
            System.out.println("Length must be 6 symbols !!");
        }
    }

    public static void Task5(Scanner in) {
        System.out.println("Task 5 ");
        System.out.print("Enter your favorite month (number) : ");
        int month = in.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12: {
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Autumn");
                break;
            }
        }
    }

    public static void Task6(Scanner in) {
        System.out.println("Task 6 ");
        System.out.print("Enter meters : ");
        int meters = in.nextInt();
        double convertedMeters = 0.0;
        String convert = null;
        System.out.println("1 -> miles, 2 -> inches, 3 -> yards");
        System.out.print("Enter length meters (number) : ");
        int format = in.nextInt();
        switch (format) {
            case 01: {
                convertedMeters = meters * 0.00062137;
                convert = "miles";
                break;
            }
            case 02: {
                convertedMeters = meters * 39.370;
                convert = "inches";
                break;
            }
            case 03: {
                convertedMeters = meters * 1.0936;
                convert = "yards";
                break;
            }
            default: {
                convertedMeters = meters;
                convert = "meters";
                break;
            }
        }
        System.out.println(meters + " meters = " + convertedMeters + " " + convert);
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static void Task7(Scanner in) {
        System.out.println("Task 7 ");
        System.out.print("Enter MIN number : ");
        int min = in.nextInt();
        System.out.print("Enter MAX number : ");
        int max = in.nextInt();
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = randInt(min, max);
        }
        for (int item : arr) {
            if (item % 2 != 0) {
                System.out.print(item + " ");
            }
        }

    }

    public static void Task8(Scanner in) {
        System.out.println("Task 8 ");
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        int n = 11;
        int[] arr1 = new int[n];
        for (int i = 1; i < n; i++) {
            arr1[i] = num1 * i;
            System.out.println(num1 + "*" + i + "=" + arr1[i]);
        }
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int[] arr2 = new int[n];
        for (int i = 1; i < n; i++) {
            arr2[i] = num2 * i;
            System.out.println(num2 + "*" + i + "=" + arr2[i]);
        }
    }

    public static void Task9(Scanner in) {
        System.out.println("Task 9 ");
        System.out.print("Enter MIN number : ");
        int min = in.nextInt();
        System.out.print("Enter MAX number : ");
        int max = in.nextInt();
        int n = 15;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = randInt(min, max);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nMin value " + arr[0]);
        System.out.println("Max value " + arr[arr.length - 1]);
    }

    public static void Task11(Scanner in) {
        System.out.println("Task 11 ");
        System.out.print("Enter length : ");
        int length = in.nextInt();
        System.out.print("Enter direction (horizontal - 1, vertical - 2) : ");
        int direction = in.nextInt();
        System.out.print("Enter symbol : ");
        String symbol = in.next();
        for(int i=0; i<length+1; i++) {
            if(direction == 1) {
                System.out.print(symbol);
            }
            if(direction==2) {
                System.out.println(symbol);
            }
        }
    }

    public static void Task12(Scanner in) {
        Integer[] arr = new Integer[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = randInt(30, 70);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf(Arrays.toString(arr));
    }
}
