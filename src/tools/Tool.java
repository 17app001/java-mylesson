package tools;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 好用函式的類別
 */
public class Tool {

    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] y = reverse(x);
        System.out.println(x == y);

        System.out.println(y);
        System.out.println(Arrays.toString(y));
        int total = 0;
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
            total += y[i];
        }

        System.out.println(total);
        System.out.println("============================");
        total = 0;
        for (int i : x) {
            total += i;
            System.out.println(i);
        }
        System.out.println(total);
    }

    public static String toString(int[] array) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
                continue;
            }
            sb.append(array[i]).append(",");
        }

        sb.append("}");
        return sb.toString();
    }

    public static String toString(double[] array) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
                continue;
            }
            sb.append(array[i]).append(",");
        }

        sb.append("}");
        return sb.toString();
    }

    /***
     * 回傳正確的整數
     * 
     * @param scanner
     * @return
     */
    public static int getNextInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("請輸入正確整數");
            scanner.next();
        }

        return scanner.nextInt();
    }

    /***
     * 反轉陣列順序
     * 
     * @param a
     * @return
     */
    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[count++] = a[i];
        }

        return b;
    }

    /***
     * 複製函式
     * 
     * @param source
     * @return
     */
    public static int[] copy(int[] source) {
        int[] dest = new int[source.length];

        System.arraycopy(source, 0, dest, 0, source.length);
        return dest;
    }

    public static double[] copy(double[] source) {
        double[] dest = new double[source.length];

        System.arraycopy(source, 0, dest, 0, source.length);
        return dest;
    }

    /***
     * 回傳正確的浮點數
     * 
     * @param scanner
     * @return
     */
    public static double getNextDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("請輸入正確數字");
            scanner.next();
        }

        return scanner.nextDouble();
    }
}
