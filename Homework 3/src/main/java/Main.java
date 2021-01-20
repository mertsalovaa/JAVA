import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Integer[] arr = new Integer[10];
//        Array array = new Array(arr);
//        fillArr(arr, array);
//        printArr(array);
//        minMaxElem(array);
//        sortArr(array);
//        replaceElem(array);
        Matrix matrix1 = new Matrix(5, 6);
        matrix1.random(5, 6, matrix1);
        matrix1.show();
        System.out.println();
        Matrix matrix2 = new Matrix(5, 6);
        matrix2.random(5, 6, matrix2);
        matrix2.show();
        System.out.println();
        Matrix matrix3 = matrix1.plus(matrix2);
        matrix3.show();
        System.out.println();
        Matrix matrix4 = matrix1.div(matrix2);
        matrix4.show();
        System.out.println(Matrix.MinMaxAverageElem(matrix2.getData()));
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    private static void fillArr(Integer[] arr, Array array) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randInt(0, 50);
        }
        array.setArr(arr);
    }

    private static void printArr(Array array) {
        System.out.println(array.toString());
    }

    private static void minMaxElem(Array array) {
        System.out.println(array.MinMaxAverageElem());
    }

    private static void sortArr(Array array) {
        int[] arr = new int[array.Sort().length];
        int j = array.Sort().length;
        for (int i = 0; i < array.Sort().length; i++) {
            System.out.print(array.Sort()[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.Sort().length; i++) {
            arr[j - 1] = array.Sort()[i];
            j = j - 1;
            System.out.print(array.Sort()[j] + " ");
        }
    }

    private static void replaceElem(Array array) {
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nReplace:\nEnter position element: ");
        int position = in.nextInt();
        System.out.print("Enter value: ");
        int value = in.nextInt();
        if (position > array.getArr().length && position <= 0) {
            System.out.println("Array don't have this position");
        } else {
            System.out.println("\nBefore -> " + array.getArr()[position]);
            array.getArr()[position] = value;
            System.out.println("After -> " + array.getArr()[position]);
        }
        printArr(array);
    }
}
