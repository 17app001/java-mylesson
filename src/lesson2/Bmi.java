package lesson2;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入姓名:");
        String name = input.nextLine();
        System.out.print("請輸入身高:");
        double height = input.nextShort();
        System.out.print("請輸入體重:");
        double weight = input.nextDouble();
        System.out.print("請輸入姓名:");
        double bmi = weight / Math.pow(height / 100, 2);

        System.out.println((int) bmi);

        System.out.printf("姓名:%s 身高:%.2f(cm) 體重:%.2f(kg) bmi:%d " +
                "原始bmi:%.2f", name, height, weight, (int) bmi, bmi);

        input.close();
    }
}
