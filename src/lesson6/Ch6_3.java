package lesson6;

import java.util.Arrays;

import tools.Tool;

/**
 * 傳值呼叫 vs 傳址呼叫
 */
public class Ch6_3 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println(x);
        sum(x, y);
        System.out.println(x + "," + y);

        System.out.println("--------------------------");
        int[] z = { 1, 2, 3, 4, 5 };
        System.out.println(z);
        // 產生複製

        int[] copy_z = Tool.copy(z);
        // 傳入複製陣列
        sum2(copy_z);
        System.out.println(Arrays.toString(z));
        System.out.println(Arrays.toString(copy_z));
    }

    public static void sum2(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i]++;
        }

        System.out.println(Arrays.toString(x));
    }

    // 宣告自己的方法(函式)
    public static int sum(int x, int y) {
        int total = x + y;
        x++; // 10 ==>11
        y++; // 20 ==>21
        System.out.printf("總計為:%d %d %d%n", total, x, y);
        return total;
    }
}
