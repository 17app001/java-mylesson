package lesson13;

import java.io.*;

/**
 * 讀取csv跟分析數據
 */
public class Ch13_10 {

    // 轉換csv text to datas
    public static void convertCsv(String str) {
        String[] datas = str.split("\n");
        int count = 0;
        for (String data : datas) {

            if (count++ == 0) {
                continue;
            }
            String[] student = data.split(",");
            String name = student[0];

            double total = 0;
            for (int i = 1; i < student.length; i++) {
                total += Double.valueOf(student[i]);
            }

            double avg = total / (student.length - 1);
            System.out.printf("%-10s total:%6.2f avg:%6.2f%n", name, total, avg);
        }
    }

    public static void main(String[] args) {
        String path = "resource/txt/student.csv";

        File file = new File(path);

        FileReader fileReader = null;

        if (file.exists()) {
            try {
                fileReader = new FileReader(path);
                char[] buffer = new char[(int) file.length()];
                fileReader.read(buffer);

                String str = new String(buffer);
                System.out.println(str);

                convertCsv(str);

            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }

        }
    }
}
