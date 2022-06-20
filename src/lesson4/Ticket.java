package lesson4;

import java.util.Scanner;

/**
 * 票價計算程式
 */
public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pay = 0;
        int price = 250;
        boolean error = false;
        System.out.println("欣欣大戲院");
        System.out.printf("全票一張%d元%n", price);
        System.out.print("請問訂幾張票:");
        int count = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < count; i++) {
            error = false;
            System.out.printf("(第%d次輸入)請選擇票種:(1)全票(2)優待票(3)敬老票(4)早場票:%n", (i + 1));
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pay = price;
                    break;
                case 2:
                    pay = price * .85;
                    break;
                case 3:
                case 4:
                    pay = price * .85 * .8;
                    break;
                default:
                    error = true;

            }

            if (error) {
                System.out.println("輸入錯誤！");
            } else {
                System.out.printf("你選擇:%d 票價為:%d元%n", choice, (int) pay);
                total += pay;
            }
        }

        System.out.printf("您訂了%d張票，總計為%d元", count, (int) total);
        scanner.close();
    }
}
