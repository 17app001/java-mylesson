package practise;

import java.util.Scanner;

public class Ch2_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入身高(公分)");
        double height = scanner.nextDouble();
        System.out.println("請輸入體重(公斤)");
        double weight = scanner.nextDouble();

        System.out.printf("BMI is %.2f", weight / Math.pow(height / 100, 2));

        scanner.close();
    }
}
