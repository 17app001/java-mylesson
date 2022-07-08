package lesson13;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;;

/***
 * 讀取文字檔案
 * 1.使用FileReader
 */
public class Ch13_6 {
    public static void main(String[] args) {
        String fileName = "resource/txt/test.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
            System.out.println(fileReader);
            try {
                // // 單一字元讀取
                // int b = fileReader.read();
                // System.out.print((char) b);
                // // 連續迴圈讀取(直到-1結束)
                // while ((b = fileReader.read()) != -1) {
                // System.out.print((char) b);
                // }
                // 一次讀取
                char[] buffer = new char[(int) new File(fileName).length()];
                fileReader.read(buffer);
                System.out.println(String.valueOf(buffer));

            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("檔案不存在");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                    System.out.println("檔案關閉");
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}
