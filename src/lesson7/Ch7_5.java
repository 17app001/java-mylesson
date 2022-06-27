package lesson7;

import java.util.Arrays;

/**
 * 陣列值的比對
 * 使用Arrays.equals
 */
public class Ch7_5 {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = { 0, 2, 3, 4, 5 };

        // 記憶體比對
        System.out.println(x == y);
        System.out.println(x.equals(y));
        // 值的比對
        System.out.println(Arrays.equals(x, y));

        boolean same = true;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                same = false;
                break;
            }
        }

        if (same) {
            System.out.println("陣列相等");
        } else {
            System.out.println("陣列不相等");
        }

        int[] numbers = { 10, 13, 16, 56, 67, 78, 89 };
        int source = 670;

        int pos = -1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (source == numbers[i]) {
                pos = i;
                break;
            }
        }
        if (pos >= 0) {
            System.out.printf("%d 查找成功，在原始陣列第%d位置", source, pos);
        } else {
            System.out.printf("該數字%d不在陣列內", source);
        }

        boolean find = false;
        for (int n : numbers) {
            if (n == source) {
                find = true;
                break;
            }
        }
        System.out.println(find);

        pos = Arrays.binarySearch(numbers, source);

        if (pos < 0) {
            System.out.printf("該數字%d不在陣列內", source);
        } else {
            System.out.printf("%d 查找成功，在原始陣列第%d位置", source, pos);
        }

        System.out.println("-----------------------------");

        // 填充陣列
        int[] a = new int[10];
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }

        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 2);
        System.out.println(Arrays.toString(a));
    }
}
