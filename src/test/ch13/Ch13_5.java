package lesson13;

import java.io.File;
import java.io.FileFilter;

public class Ch13_5 {
    public static void main(String[] args) {
        String path = "resource/img";

        File[] files = new File(path).listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().toLowerCase().endsWith(".png")) {
                    return true;
                }

                return false;
            }

        });

        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
