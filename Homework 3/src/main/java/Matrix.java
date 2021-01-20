import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Matrix {
    private int M;
    private int N;
    private int[][] data;

    public Matrix(int m, int n) {
        M = m;
        N = n;
        data = new int[M][N];
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void random(int M, int N, Matrix matrix) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix.data[i][j] = randInt(10, 155);
            }
        }
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Matrix plus(Matrix B) {
        Matrix A = this;
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                C.data[i][j] = A.data[i][j] + B.data[i][j];
        return C;
    }

    public Matrix minus(Matrix B) {
        Matrix A = this;
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                C.data[i][j] = A.data[i][j] - B.data[i][j];
        return C;
    }

    public Matrix mult(Matrix B) {
        Matrix A = this;
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                C.data[i][j] = A.data[i][j] * B.data[i][j];
        return C;
    }

    public Matrix div(Matrix B) {
        Matrix A = this;
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                C.data[i][j] = A.data[i][j] / B.data[i][j];
        return C;
    }

    public static String MinMaxAverageElem(int[][] matrix){
        int max = matrix[0][0];
        int min = matrix[0][0];
        int numbers = 0, counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                numbers+=matrix[i][j];
                counter++;
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                } else if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        int average = numbers / counter;
        return "Min elem = " + min + ", max elem = " + max + ", average = " + average;
    }
}
