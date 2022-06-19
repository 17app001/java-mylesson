package practise;

import java.util.Scanner;

public class Ch3_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("學生成績輸入系統");
        System.out.print("請輸入國文分數:");
        int chinese = scanner.nextInt();
        System.out.print("請輸入數學分數:");
        int math = scanner.nextInt();
        System.out.print("請輸入英文分數:");
        int english = scanner.nextInt();

        int total = chinese + math + english;
        double average = total / 3.0;

        System.out.println("==================================");
        System.out.printf("%10s%10s%10s%10s%10s%n", "chinese", "english", "math", "total", "average");
        System.out.printf("%10d%10d%10d%10d%10.2f%n", chinese, english, math, total, average);

        scanner.close();
    }
}
