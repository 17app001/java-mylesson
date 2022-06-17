package lesson3;

import java.util.Scanner;

/*
 * 時間計算
 * 增加天數跟輸入秒數
 */
public class Ch3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入秒數:");
        long second = scanner.nextLong();
        int min = 0, hour = 0, day = 0;

        min = (int) (second / 60);
        hour = min / 60;
        int leftSec = (int) (second % 60);
        min = min % 60;

        day = hour / 24;
        hour = hour % 24;

        System.out.printf("%d秒是%d天%d小時%d分%d秒",
                second, day, hour, min, leftSec);

        scanner.close();

    }
}
