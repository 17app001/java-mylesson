package lesson13;

import java.io.*;

public class Ch13_8 {
    public static void main(String[] args) {
        String path = "src/resource/student.txt";
        FileInputStream is = null;
        try {
            is = new FileInputStream(path);
            byte[] bs = is.readAllBytes();
            // is.read(bs);

            String str = new String(bs);

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

    }
}
