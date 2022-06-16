package lesson2;

import java.util.Scanner;

public class TaxiPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入公里數:");
        float km = scanner.nextFloat();

        double pay = 70 + (km - 1) * 20;
        if (km < 1) {
            pay = 70;
        }

        System.out.printf("里程數:%.2f(km)\t費用為:%d元(原始費用:%.2f元)",
                km, (int) pay, pay);

        scanner.close();
    }
}
