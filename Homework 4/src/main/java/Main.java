import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task2();
    }

    private static void Task2() {
        Map<String, String> dictionary = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        fillDictionary(dictionary);
        printDictionary(dictionary);
        editElemByKey(dictionary, in);
        deleteByElem(dictionary, in);
    }

    private static void deleteByElem(Map<String, String> dictionary, Scanner in) {
        System.out.println("\n Delete !!!");
        System.out.print("Enter word 1 : ");
        String word1 = in.next();
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getKey().equals(word1)) {
                dictionary.remove(entry.getKey());
                printDictionary(dictionary);
                return;
            }
        }
    }

    private static void editElemByKey(Map<String, String> dictionary, Scanner in) {
        System.out.println("\n Edit !!!");
        System.out.print("Enter word 1 : ");
        String word1 = in.next();
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getKey().equals(word1)) {
                System.out.print("Enter word 2 : ");
                String word2 = in.next();
                System.out.println(entry.setValue(word2));
            }
        }
        printDictionary(dictionary);
    }

    private static void addNewElem(Map<String, String> dictionary, Scanner in) {
        System.out.println("\n Add !!!");
        System.out.print("Enter first word: ");
        String word1 = in.next();
        System.out.print("\nEnter second word: ");
        String word2 = in.next();
        dictionary.put(word1, word2);
    }

    private static void fillDictionary(Map<String, String> dictionary) {
        System.out.println("\n Fill !!!");
        dictionary.put("hello", "привіт");
        dictionary.put("world", "світ");
        dictionary.put("dog", "собака");
        dictionary.put("cat", "кіт");
    }

    private static void printDictionary(Map<String, String> dictionary) {
        System.out.println("\n Print !!!");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }


}
