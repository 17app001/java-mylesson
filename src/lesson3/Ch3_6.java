package lesson3;

import java.util.Scanner;

public class Ch3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入國文:");
        float ch = scanner.nextFloat();
        System.out.print("請輸入英文:");
        float eng = scanner.nextFloat();
        System.out.print("請輸入數學:");
        float math = scanner.nextFloat();

        String pass;
        if ((ch >= 60 || eng >= 60) && math >= 60) {
            pass = "恭喜通過!";
        } else {
            pass = "留校察看~~";
        }

        // 三元運算子
        String pass1 = ((ch >= 60 || eng >= 60) && math >= 60) ? "恭喜通過!" : "留校察看~~";
        System.out.println(pass + "," + pass1);

        scanner.close();
    }
}
