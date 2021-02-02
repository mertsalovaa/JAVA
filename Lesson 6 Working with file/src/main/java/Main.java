import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "my.txt";

//        writeFile(fileName);
//        readFile(fileName);

        writeUTF8File(fileName);
        readUTF8File(fileName);

    }

    private static void writeUTF8File(String fileName) {
        try {
            DataOutputStream fileData = new DataOutputStream(new FileOutputStream(fileName));
            fileData.writeUTF("Winter !!");
            fileData.writeUTF("Good mood !!");
            fileData.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readUTF8File(String fileName) {
        try {
            DataInputStream fileData = new DataInputStream(new FileInputStream(fileName));
            String text1 = fileData.readUTF();
            String text2 = fileData.readUTF();
            System.out.println(text1);
            System.out.println(text2);
            fileData.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void writeFile(String fileName) {
        try {
            Writer writer = new FileWriter(fileName, true);
            String str = "My name is Iryna";
            for(int i=0; i< str.length();i++) {
                char ch = str.charAt(i);
                writer.write((int)ch);
            }
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readFile(String fileName) {
        try {
            Reader reader = new FileReader(fileName);
            int letter = -1;
            while ((letter = reader.read()) != -1) {
//                System.out.println(letter);
                System.out.print((char) letter);
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
