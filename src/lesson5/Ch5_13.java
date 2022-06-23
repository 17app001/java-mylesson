package lesson5;

import java.util.Arrays;

/**
 * 陣列與記憶體位置
 * 完整複製方式
 */
public class Ch5_13 {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        System.out.println(x);
        System.out.println("==================");
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            total += x[i];
        }
        System.out.println(total);
        System.out.println(Arrays.toString(x));

        System.out.println("=================");
        // 指向同個記憶體位置
        int[] y = x;
        System.out.println(y);
        System.out.println(x == y);
        System.out.println(Arrays.equals(x, y));
        // 更改連動
        y[0] = 11;
        System.out.println(Arrays.toString(x));
        // 完整複製
        // 釋放記憶體
        y = null;
        System.out.println(y);
        // 產生實體
        y = new int[x.length];
        System.out.println(y);
        // 開始複製
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        // 輸出測試
        System.out.println(x == y);
        System.out.println(Arrays.equals(x, y));
        x[0] = 21;
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.equals(x, y));
    }
}