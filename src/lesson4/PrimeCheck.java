package lesson4;

import java.util.Scanner;

/**
 * 1.質數檢查
 * 2.數字型態檢查(while + !(not))
 */
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int j = 0; j < 3; j++) {
            System.out.println("請輸入一個整數:");
            // 檢查輸入是否是整數 false==>true(使用not)
            while (!scanner.hasNextInt()) {
                System.out.println("請輸入正確整數");
                scanner.next();
            }
            // 取得正確整數
            int x = scanner.nextInt();
            // 初始歸零
            count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    System.out.println(i);
                    count++;
                }
                // 大於2強制離開(效能優化)
                if (count > 2) {
                    break;
                }
            }
            // 判斷是否是質數
            if (count == 2) {
                System.out.println(x + "是質數");
            } else {
                System.out.println(x + "不是質數");
            }
        }

        scanner.close();
    }

}
