package lesson11;

import java.util.Scanner;

import lesson11.atm.ATM;
import tools.Tool;

public class ATMDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 設定第一次帳號密碼
        System.out.println("第一次請設定帳號跟密碼");
        System.out.print("請輸入帳號:");
        String name = scanner.next();
        System.out.print("請輸入密碼:");
        String password = scanner.next();
        // 產生ATM物件
        ATM atm = new ATM(name, password);
        System.out.println("密碼設定完成");
        System.out.println("==============================");

        // 實際登入
        int count = 0;
        do {
            System.out.printf("請輸入帳號跟密碼(第%d次)%n", count + 1);
            System.out.print("請輸入帳號:");
            name = scanner.next();
            System.out.print("請輸入密碼:");
            password = scanner.next();

            atm.login(name, password);
            if (atm.isLogin()) {
                break;
            }

        } while (++count < 3);

        System.out.println("==============================");

        if (!atm.isLogin()) {
            System.out.println("登入" + count + "次失敗，鎖卡");
            scanner.close();
            return;
        }

        while (true) {
            System.out.print("(1)提錢(2)存錢(3)餘額(4)離開:");
            int choice = Tool.getNextInt(scanner);
            if (choice == 4) {
                break;
            }

            if (choice == 1) {
                System.out.print("請輸入提款金額:");
                int amount = Tool.getNextInt(scanner);
                // 進行例外處理(WithDrawException)
                try {
                    atm.withdraw(amount);
                } catch (ATM.WithDrawException ex) {
                    System.out.println(ex.getMessage());
                    System.out.printf("國泰世華提醒您，餘額不足..還缺%d元%n",
                            Math.abs(atm.getBalance() - ex.getAmount()));
                } catch (ATM.CheckAmountException ex) {
                    System.out.println(ex.getMessage());
                    System.out.printf("國泰世華提醒您，金額輸入不正確(%d元)%n",
                            ex.getAmount());
                }

            } else if (choice == 2) {
                System.out.print("請輸入存款金額:");
                int amount = Tool.getNextInt(scanner);
                try {
                    atm.deposit(amount);
                } catch (ATM.CheckAmountException ex) {
                    System.out.println(ex.getMessage());
                    System.out.printf("國泰世華提醒您，金額輸入不正確(%d元)%n",
                            ex.getAmount());
                }
            } else if (choice == 3) {
                System.out.println(atm);
            } else {
                System.out.println("選擇不正確!");
            }
        }

        System.out.println("感謝使用!");
        scanner.close();
    }
}
