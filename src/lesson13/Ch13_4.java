package lesson13;

import java.io.*;
import java.util.*;

/**
 * 使用遞迴取出所有目錄跟檔案
 * 1.findAllFiles
 * 2.新增filter功能
 */
public class Ch13_4 {

    public static void main(String[] args) {
        // 可以改成File?
        ArrayList<File> fileList = new ArrayList<File>();
        String path = "resource/img";
        String[] filters = { ".png", ".gif", ".jpg" };
        findAllFiles(path, fileList, filters);

        System.out.println("目前共有" + fileList.size() + "個檔案");

        // 輸出檔案資訊使用File?
        fileList.forEach(file -> {
            System.out.println("------------------------------------");
            System.out.println(file);
            System.out.println(file.getName() + "," + file.length());
        });

    }

    public static void findAllFiles(String path, ArrayList<File> fileList, String[] filters) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                findAllFiles(f.getPath(), fileList, filters);
                continue;
            }

            if (filters == null) {
                fileList.add(f);
                continue;
            }

            for (String filter : filters) {
                if (f.getName().endsWith(filter)) {
                    fileList.add(f);
                    break;
                }
            }
        }
    }

}
