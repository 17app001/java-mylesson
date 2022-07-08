package lesson13;

import java.io.*;

public class Ch13_7 {
    public static void main(String[] args) {
        String fileName = "src/resource/test1.txt";
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(fileName, true);
            fileWriter.write("\nABC");
            fileWriter.write("\n中文測試");

        } catch (Exception ex) {
            ex.getMessage();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
