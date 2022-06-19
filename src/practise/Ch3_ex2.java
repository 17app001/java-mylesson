package practise;

import java.util.Scanner;

public class Ch3_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入存款金額:");
        double amount = scanner.nextDouble();
        System.out.print("請輸入年利率:");
        double rate = scanner.nextDouble();

        double monthInterest = amount * (rate / 100 / 12);
        double totalAmount = amount + monthInterest * 12;

        System.out.printf("(月利率為:%f%%) 每月利息為:%.0f%n", rate / 100 / 12, monthInterest);
        System.out.printf("(年利率為:%f%%)年收益為:%.0f%n", rate / 100, totalAmount);

        scanner.close();

    }

}
