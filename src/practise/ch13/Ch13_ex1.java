package practise.ch13;

import java.io.*;

public class Ch13_ex1 {
    public static void main(String[] args) {
        BufferedReader fr = null;
        BufferedWriter fw = null;

        try {
            fr = new BufferedReader(new FileReader("test.html"));
            fw = new BufferedWriter(new FileWriter("test1.html"));
            String string = fr.readLine();
            int count = 0;
            while (string != null) {
                String str = count++ + " " + string + "\n";
                System.out.print(str);
                fw.write(str);
                string = fr.readLine();
            }

            System.out.println("資料寫入完成!");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.flush();
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("done!");
    }

}
