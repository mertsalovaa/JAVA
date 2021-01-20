import java.util.Arrays;
import java.util.Collections;

public class Array {
    private Integer[] arr;

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    public Integer[] getArr() {
        return arr;
    }

    public Array(Integer[] arr) {
        this.arr = arr;
    }

    private String toStrElem(int elem) {
        return String.valueOf(elem);
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < getArr().length; i++) {
            str += (toStrElem(arr[i]) + " ");
        }
        return str;
    }

    public String MinMaxAverageElem() {
        int min = Collections.min(Arrays.asList(getArr()));
        int max = Collections.max(Arrays.asList(getArr()));
        int numbers = 0;
        for (Integer item:getArr()) {
            numbers += item;
        }
        int average = numbers / getArr().length;
        return "Min elem = " + min + ", max elem = " + max + ", average = " + average;
    }

    public int[] Sort() {
        int[] arr = new int[getArr().length];
        for (int i=0; i < getArr().length; i++) {
            arr[i] = getArr()[i];
//            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
//        System.out.println(arr);
        return arr;
    }
}
