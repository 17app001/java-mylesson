package test;

import java.util.Arrays;

/**
 * 樂透產生器
 * 1.不重複
 */
public class Lotto {
    public static void main(String[] args) {
        int[][] lotto = new int[10][7];

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto[i].length - 1; j++) {
                // 0~49 1,2....49
                // 取得1~49(包含49的亂數)
                while (true) {
                    int number = (int) (Math.random() * 49) + 1;
                    boolean duplicate = false;
                    for (int n : lotto[i]) {
                        if (n == number) {
                            duplicate = true;
                            break;
                        }
                    }
                    if (!duplicate) {
                        lotto[i][j] = number;
                        break;
                    }
                }
            }

            Arrays.sort(lotto[i]);

            lotto[i][lotto[i].length - 1] = (int) (Math.random() * 49) + 1;

        }

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
