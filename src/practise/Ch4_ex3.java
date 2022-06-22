package practise;

import java.util.Scanner;

public class Ch4_ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0, total = 0;

        while (true) {
            System.out.println("請輸入第" + (++count) + "位學生姓名:");
            String name = input.next();
            System.out.printf("請輸入%s分數:", name);
            int score = input.nextInt();
            if (score < 0 || score > 100) {
                count--;
                continue;
            }

            total += score;

            System.out.print("是否離開?(y/n)");
            String exit = input.next();
            if (exit.toLowerCase().equals("y"))
                break;
        }

        System.out.printf("共輸入%d位學生\n", count);
        System.out.printf("總分為%d\n", total);
        System.out.printf("平均分為%.1f\n", (float) total / count);
        input.close();
    }
}
