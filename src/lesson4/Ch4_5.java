package lesson4;

import java.util.Scanner;

/**
 * 輸入累計的起始跟終止值
 */
public class Ch4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入起始值，終止值(空白區隔):");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start > end) {
            System.out.printf("起始值(%d)不能大於終止值(%d)", start, end);
        } else {
            int total = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    total += i;
                }
            }
            System.out.printf("%d~%d的偶數總和:%d", start, end, total);
        }
        scanner.close();
    }
}