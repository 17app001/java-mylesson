package lesson13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/***
 * 目錄與檔案路徑表達方式
 * 1.使用File類別
 * 
 */
public class Ch13_1 {
    public static void main(String[] args) {
        // 專案目錄底下
        String fileName = "test.txt";
        // 路徑表達方式(相對路徑)
        // windows路徑表達方式==>\\
        fileName = "src\\lesson13\\test1.txt";
        // (v)linux路徑表達方式==>/
        fileName = "src/lesson13/test1.txt";
        // 絕對路徑
        fileName = "C:/Users/Jerry/OneDrive/桌面/JavaProject/MyLesson/src/lesson13/test1.txt";
        fileName = "src/lesson13";

        fileName = "test.txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println(file.getName());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println(file.length());

            System.out.printf("%s 檔案:%b 目錄:%b size:%.2f(kb)%n",
                    file.getName(), file.isFile(), file.isDirectory(), file.length() / 1024.0);

            System.out.println("============================================");
            // 絕對路徑
            System.out.println(file.getAbsolutePath());
            // 上一層目錄
            System.out.println(file.getParent());
            // 目前目錄
            System.out.println(file.getPath());

            // 刪除檔案
            Scanner scanner = new Scanner(System.in);
            System.out.println("是否刪除檔案?");
            if (scanner.next().toLowerCase().equals("y")) {
                if (file.delete()) {
                    System.out.println(fileName + "刪除成功!");
                }
            }
            scanner.close();

        } else {
            // 創建檔案
            try {
                if (file.createNewFile()) {
                    System.out.println(fileName + "建立成功!");
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}
