package lesson5;

import java.util.Arrays;

public class Ch5_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 5, 2, 3, 4, 1 };
        int[] c = a;

        System.out.println(a + "," + b);
        System.out.println(a == b);
        System.out.println(c == a);
        System.out.println(x == y);

        System.out.println(Arrays.equals(a, b));
    }
}
