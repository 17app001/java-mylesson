package lesson13;

import java.io.File;
import java.io.IOException;

public class Ch13_2 {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";

        File file = new File(fileName);
        System.out.println(file);

        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("檔案建立成功!");
            }
        }

        String path = "resource/txt";
        new File(path).mkdirs();

        new File(path, "test.txt").createNewFile();

    }
}
