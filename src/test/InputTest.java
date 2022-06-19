package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("輸入姓名");
        String name = br.readLine();
        System.out.println("輸入年齡");
        int age = Integer.valueOf(br.readLine());

        System.out.println("輸入姓名");
        name = br.readLine();
        System.out.println("輸入年齡");
        age = Integer.valueOf(br.readLine());

        System.out.println(name + "," + age);
    }
}
