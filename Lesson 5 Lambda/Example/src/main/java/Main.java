import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Year {
    String year(int year);
}

interface ShowSortInfo {
    void show(int i);
}

public class Main {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList();
        list.add(new Dog("Шарік", 4));
        list.add(new Dog("Барсік", 1));
        list.add(new Dog("Тузік", 2));
        list.add(new Dog("Рекс", 3));

        System.out.println("Before : ");
        list.forEach((x)-> System.out.println(x));

        Collections.sort(list, new Comparator<Dog>() {
            @Override
            public int compare(Dog left, Dog right) {
                return left.getAge()-right.getAge();
            }
        });
        System.out.println("\n\nAfter : ");
        list.forEach((x)-> System.out.println(x));

    }
    static void test1() {
        List<Integer> list = new ArrayList();
        list.add(741);
        list.add(4);
        list.add(100);
        list.add(5);
        list.add(45);
        System.out.println("Before : ");
        list.forEach((x)-> System.out.print(x + " "));

        System.out.println("\n\nAfter : ");
        Collections.sort(list);
        list.forEach((x)-> System.out.print(x + " "));
    }
}





