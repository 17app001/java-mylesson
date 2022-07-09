package test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentTxt {
    public static void main(String[] args) {
        String path = "resource/txt/student.txt";
        File file = new File(path);
        FileReader fileReader = null;

        if (file.exists()) {
            System.out.println(file.length());

            try {
                fileReader = new FileReader(path);
                char[] buffer = new char[(int) file.length()];
                fileReader.read(buffer);

                String string = new String(buffer);
                System.out.println(string);
                String[] datas = string.split("\n");
                // System.out.println(datas);

                for (String data : datas) {
                    String[] student = data.split(",");
                    String name = student[0];
                    // System.out.println(name);
                    double total = 0;
                    for (int i = 1; i < student.length; i++) {
                        total += Double.parseDouble(student[i]);
                    }

                    System.out.printf("%-8s 總分為:%7.2f 平均分為:%6.2f%n", name, total, total / (student.length - 1));
                }

            } catch (IOException e) {
                System.out.println(e);
            } finally {
                try {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }

        }

    }

}
