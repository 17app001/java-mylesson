package lesson13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/***
 * 寫入文字檔案
 */
public class Ch13_7 {
    public static void main(String[] args) {
        String fileName = "resource/txt/temp.txt";
        FileWriter fileWriter = null;
        Scanner scanner = new Scanner(System.in);

        try {
            fileWriter = new FileWriter(fileName);
            System.out.println(fileWriter);
            fileWriter.write("123\n456\n中文測試");
            System.out.println("寫入成功!");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }

            scanner.close();
        }

    }
}
