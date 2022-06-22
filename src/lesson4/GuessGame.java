package lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜數字遊戲
 * 1.亂數(random)
 * 2.重複次數(v)
 * 3.給出範圍
 */
public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // 1~50數字
        int number = rand.nextInt(50) + 1;
        boolean bingo = false;
        // 跑動迴圈
        for (int i = 0; i < 5; i++) {
            System.out.print("請猜一個數字(1~50):");
            while (!scanner.hasNextInt()) {
                System.out.println("請輸入正確");
                scanner.next();
            }
            // 開始猜數字
            int guess = scanner.nextInt();
            // 猜對狀況
            if (guess == number) {
                System.out.println("你猜對了!");
                bingo = true;
                break;
            }

            if (guess > number) {
                System.out.println("請猜小一點~");
            } else {
                System.out.println("請猜大一點~");
            }
        }

        if (bingo) {
            System.out.println("恭喜中獎!");
        } else {
            System.out.println("正確數字為:" + number);
        }
        scanner.close();
    }
}