import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file name 1: ");
        String file1 = "txt1.txt";
        System.out.print("Enter file name 2: \n");
        String file2 = "txt2.txt";
        try {
            Reader reader1 = new FileReader(file1);
            Reader reader2 = new FileReader(file2);
            int letter1 = -1, letter2 = -1;
            String text1 = "", text2 = "";
            while ((letter1 = reader1.read()) != -1) {
                text1 += (char) letter1;
            }
            while ((letter2 = reader2.read()) != -1) {
                text2 += (char) letter2;
            }
            System.out.println(text1);
            System.out.println(text2 + "\n");
            for (int i = 0; i < text1.length(); i++) {
                for (int j = 0; j < text2.length(); j++) {
                    if (text1.charAt(i) != text2.charAt(j)) {
                        System.out.print(text1.charAt(j));
                    }
                }
            }

            reader1.close();
            reader2.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
