package lesson13;

import java.io.File;
import java.util.Arrays;

/***
 * 1.列出目錄下所有檔案(單一層目錄)
 * 
 */
public class Ch13_3 {
    public static void main(String[] args) {
        String path = "src/lesson10";

        File file = new File(path);

        System.out.println(file);
        System.out.println(Arrays.toString(file.list()));
        System.out.println("==============================================");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.printf("%s 檔案:%b 目錄:%b size:%.4f(kb)%n",
                    f.getName(), f.isFile(), f.isDirectory(), f.length() / 1024.0);
        }
    }

}
