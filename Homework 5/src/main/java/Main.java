import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        task1();

        Days test = (x,y) -> {
            return getDifferenceDays(x,y);
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter date1 : ");
        Date date1 = new Date(in.nextInt());
        System.out.println("Enter date2 : ");

        String res = test.days();
        System.out.println(res);

    }

    public static long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
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
