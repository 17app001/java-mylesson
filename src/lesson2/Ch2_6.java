package lesson2;

/**
 * 利息計算
 */
public class Ch2_6 {
    public static void main(String[] args) {
        float rate = 0.02f;
        int money = 50000;
        // 年利息
        float interest = money * rate;
        // 本利和
        double amount = money + interest;
        String name = "張三";

        System.out.printf("存款人:%-10s 存款金額:%+08d 年利率:%6.2f%% " +
                "年利息:%.2f 本利和:%,.2f%n", name, money, rate, interest, amount);

        System.out.printf("計算結束");
    }

}