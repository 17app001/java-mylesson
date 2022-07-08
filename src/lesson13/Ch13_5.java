package lesson13;

import java.io.File;
import java.io.FileFilter;

/***
 * 篩選檔案(使用FileFilter介面)
 */
public class Ch13_5 {
    public static void main(String[] args) {
        String path = "resource/img";

        File[] files = new File(path).listFiles(new FileFilter() {
            private final String[] ext = { ".bmp" };

            @Override
            public boolean accept(File pathname) {
                for (String e : ext) {
                    if (pathname.getName().endsWith(e)) {
                        return true;
                    }
                }

                return false;
            }
        });

        for (File f : files) {
            System.out.println(f.getName());
        }

    }
}
