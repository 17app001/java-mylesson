package lesson7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 字串使用chatAt&toCharArray
 */
public class Ch7_2 {
    public static void main(String[] args) {
        String name = "Mario";
        String email = "Mario@gmail.com";
        String password = "123456";
        double age = 24.5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入分數:");
        // "99","99.5"
        String score = scanner.next();
        System.out.println(score);
        // int ==>Integer
        // double==>Double
        System.out.println(score + 5);
        scanner.close();

        int x = 10;
        float y = 20.0f;

        System.out.println("總分:" + String.valueOf(x + y));

        System.out.println(email.length());
        System.out.println(Arrays.toString(email.toCharArray()));
        System.out.println(email.charAt(0));
        for (char c : email.toCharArray()) {
            System.out.print(c + ",");
        }

        System.out.println();
        System.out.printf("%s email:%s password:%s age:%5.1f%n",
                name, email, password, age);
        System.out.printf("%s email:%s password:%s age:%5.1f%n",
                "Kevin", email, password, age);

        // String.format
        String info1 = String.format("%s email:%s password:%s age:%5.1f%n",
                name, email, password, age);
        String info2 = String.format("%s email:%s password:%s age:%5.1f%n",
                "Kevin", "Kevin@gmai.com", password, 32.0);

        System.out.println(info1 + "," + info2);

    }
}
