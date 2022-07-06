package practise.ch8;

import java.util.Scanner;

public class Ch8_ex1 {

    public static void main(String[] args) {

        System.out.println("第一次請設定帳號跟密碼");
        Scanner input = new Scanner(System.in);
        System.out.println("姓名:");
        String name = input.next();
        System.out.println("密碼:");
        String password = input.next();
        System.out.println("密碼設定完成");

        System.out.println("--------------------------");
        ATM atm = new ATM(name, password);

        atm.login("jerry1", "123456");
        atm.deposit(1000);
        atm.withdraw(500);
        System.out.println(atm.toString());

        input.close();
    }
}
