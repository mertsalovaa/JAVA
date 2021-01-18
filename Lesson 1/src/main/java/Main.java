import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String name;
//        System.out.println("Your name :");
//        Scanner in = new Scanner(System.in);
//        name = in.next();
//        if (name.length() == 6) {
//            System.out.println("Hello, " + name + " !");
//        } else {
//            System.out.println("Length must be 6 symbols !");
//        }
//        int n1 = in.nextInt(); INT
//        %/2==0 parne - neparne for DZ

        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = randInt(-10,2);
        }
        for(int item:arr) {
            System.out.print(item + "\t");
        }
    }
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

}
