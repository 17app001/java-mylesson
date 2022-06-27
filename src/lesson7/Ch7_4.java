package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * wrapper 包裹型別
 * Integer.valueOf("35")
 * Double.valueOf("35.5")
 * 將所有的輸入統一成字串，然後包裹進行轉型
 */

public class Ch7_4 {
    public static void main(String[] args) {
        // 使用包裹類進行型態轉換
        String ageStr = "17";
        System.out.println(ageStr + 1);
        // int ==> Integer
        Integer age1 = Integer.valueOf(ageStr);
        System.out.println(age1);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            System.out.print("請輸入姓名:");
            String name = br.readLine();
            System.out.print("請輸入年齡:");
            int age = Integer.valueOf(br.readLine());
            System.out.println(age);
            System.out.print("請輸入地址:");
            String address = br.readLine();
            System.out.print("請輸入身高:");
            double height = Double.valueOf(br.readLine());
            System.out.print("請輸入體重:");
            float weight = Float.valueOf(br.readLine());

            double bmi = weight / Math.pow(height / 100, 2);

            System.out.printf("姓名:%s 年齡:%d 地址:%s BMI:%.2f", name,
                    age, address, bmi);

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
