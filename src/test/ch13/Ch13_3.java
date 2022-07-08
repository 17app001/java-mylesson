package lesson13;

import java.io.File;
import java.util.Arrays;

public class Ch13_3 {
    public static void main(String[] args) {
        String path = "src/lesson11";

        File file = new File(path);

        System.out.println(file.getAbsolutePath());

        System.out.println(Arrays.toString(file.list()));

        File[] files = file.listFiles();

        for (File f : files) {
            System.out.printf("名稱:%s 檔案大小:%.2f(kb) 是否是目錄:%b%n",
                    f.getName(), f.length() / 1024.0, f.isDirectory());
        }
    }
}
