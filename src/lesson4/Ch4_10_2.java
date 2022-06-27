package lesson4;

import java.util.Scanner;

/**
 * 1.優化程式
 * 2.輸出目前第幾位同學
 * 3.計算平均分
 */
public class Ch4_10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("學生成績輸入系統");
        double total = 0;
        boolean exit = false;
        int count = 0;

        // do-while
        do {
            System.out.printf("請輸入第%d位成績:", count + 1);
            total += scanner.nextDouble();
            System.out.println("是否離開?(y/n)");
            // 吃掉換行字元
            scanner.nextLine();
            // 取得輸入是否繼續(包含換行)
            exit = scanner.nextLine().toLowerCase().equals("y") ? true : false;
            count++;
        } while (!exit);

        System.out.printf("共%d位同學 總分為:%.2f 平均分為:%.2f",
                count, total, total / count);
        scanner.close();
    }
}
