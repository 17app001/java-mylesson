package lesson13;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Ch13_6 {
    public static void main(String[] args) {
        String fileName = "src/resource/test.txt";

        File file = new File("src/resource", "test.txt");

        if (!file.exists()) {
            System.out.println(fileName + "不存在!");
            return;
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            System.out.println(fileReader);
            // int b = fileReader.read();
            // System.out.println((char) b);
            // int b = 0;
            // while ((b = fileReader.read()) != -1) {
            // System.out.print((char) b);
            // }

            char[] buffer = new char[(int) file.length()];
            fileReader.read(buffer);
            System.out.println(buffer);

        } catch (IOException ex) {
            System.out.println("=============================");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}