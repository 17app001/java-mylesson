package practise;

import java.util.Scanner;

public class Ch4_ex1 {

    public static void main(String[] args) {
        System.out.println("火車票計費程式");
        System.out.print("1. 自強號 每公里 2.3 元\n" +
                "2. 莒光號 每公里 1.78元\n" +
                "3. 區間車 每公里 1.45元 \n");

        Scanner input = new Scanner(System.in);
        System.out.println("請輸入選擇:");
        int choice = input.nextInt();
        System.out.println("請輸入公里數:");
        int km = input.nextInt();

        double pay = 0;
        String train = "區間車";
        if (choice == 1) {
            pay = km * 2.3;
            train = "自強號";
        } else if (choice == 2) {
            pay = km * 1.78;
            train = "莒光號";
        } else {
            pay = km * 1.45;
        }

        System.out.println("您選的是" + train + " 共" + Math.round(pay) + "元");
        input.close();
    }

}
