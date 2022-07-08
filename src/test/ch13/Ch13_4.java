package lesson13;

import java.io.File;
import java.util.ArrayList;

public class Ch13_4 {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<File>();
        String path = "src/lesson11";

        getAllFiles(path, fileList);

        System.out.println("======================================");
        System.out.printf("共找到%d檔案%n", fileList.size());

        System.out.println(fileList);

    }

    public static void getAllFiles(String path, ArrayList<File> fileList) {
        File[] files = new File(path).listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                getAllFiles(file.getAbsolutePath(), fileList);
                continue;
            }

            fileList.add(file);
        }

    }
}
