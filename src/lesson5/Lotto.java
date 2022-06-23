package lesson5;

import java.util.Arrays;

/**
 * 樂透產生器
 */
public class Lotto {
    public static void main(String[] args) {
        int[][] lotto = new int[10][7];

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto[i].length; j++) {
                // 取得1~49(包含49的亂數)
                while (true) {
                    int number = (int) (Math.random() * 49) + 1;
                    // 檢查是否重複
                    boolean duplicate = false;
                    for (int n : lotto[i]) {
                        if (n == number) {
                            duplicate = true;
                            break;
                        }
                    }
                    // 不重複
                    if (!duplicate) {
                        lotto[i][j] = number;
                        break;
                    }
                }
            }
            // 排序
            // Arrays.sort(lotto[i]);
            Arrays.sort(lotto[i], 0, 6);

        }

        // 輸出結果
        for (int[] number : lotto) {
            int count = 0;
            for (int n : number) {
                if (count++ == number.length - 1) {
                    System.out.printf("特別號:%2d", n);
                    continue;
                }
                System.out.printf("%2d|", n);
            }
            System.out.println();
        }

    }
}
