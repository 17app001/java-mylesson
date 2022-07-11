package practise.ch13;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ch13_ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.print("請輸入姓名(-1:exit):");
            String name = scanner.next();
            if (name.equals("-1")) {
                break;
            }
            Student st = new Student(name);
            try {
                System.out.print("請輸入身高:");
                st.height = scanner.nextDouble();
                System.out.print("請輸入體重:");
                st.weight = scanner.nextDouble();
                double bmi = st.weight / ((st.height / 100) * (st.height / 100));
                DecimalFormat df = new DecimalFormat("##.00");
                bmi = Double.parseDouble(df.format(bmi));
                System.out.println("BMI " + bmi);
                st.setBMI(bmi);

                studentList.add(st);

            } catch (InputMismatchException ex) {
                ex.printStackTrace();
            }
        }

        FileWriter fw = null;
        System.out.println("共寫入" + studentList.size() + "筆資料");
        try {
            fw = new FileWriter("student.txt");
            for (Student st : studentList) {
                StringBuffer sb = new StringBuffer(st.name + "\t");
                sb.append(st.height + "\t" + st.weight + "\t" + st.bmi + "\n");
                fw.write(sb.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("檔案寫入完成!");
        scanner.close();

    }
}
