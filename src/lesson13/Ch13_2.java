package lesson13;

import java.io.File;
import java.io.IOException;

/**
 * 創建目錄跟檔案
 */
public class Ch13_2 {
    public static void main(String[] args) throws IOException {
        String path = "resource/txt";
        String file = "test.txt";
        // 建立目錄
        new File(path).mkdirs();
        // 建立檔案
        if (new File(path, file).createNewFile()) {
            System.out.println(file + "建立成功!");
        }

        /***
         * 程式練習
         * 請創建
         * [1] resource/txt/temp
         * [2] 1.txt~10.txt ==>resource/txt/temp
         * 
         */
        path = "resource/txt/temp";
        new File(path).mkdirs();

        for (int i = 0; i < 10; i++) {
            String fileName = (i + 1) + ".txt";
            System.out.println(fileName);
            // 建立檔案
            if (new File(path, fileName).createNewFile()) {
                System.out.println(file + "建立成功!");
            }
        }

    }
}
