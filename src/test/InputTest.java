package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("請輸入姓名:");
            String name = br.readLine();
            System.out.println("請輸入年齡:");
            int age = Integer.valueOf(br.readLine());
            System.out.println("請輸入地址:");
            String address = br.readLine();

            System.out.printf("姓名:%s 年齡:%d 地址:%s", name, age, address);

            br.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
