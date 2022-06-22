package practise;

import java.util.Scanner;

public class Ch4_ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("計算機程式");
        System.out.print("請輸入數字1:");
        int x = input.nextInt();
        System.out.print("請輸入數字2:");
        int y = input.nextInt();
        System.out.print("請輸入運算子:");
        String op = input.next();
        // char opc=op.charAt(0);
        switch (op) {
            case "+":
                System.out.printf("%d%s%d=%d", x, op, y, x + y);
                break;
            case "-":
                System.out.printf("%d%s%d=%d", x, op, y, x - y);
                break;
            case "*":
            case "x":
            case "X":
                System.out.printf("%d%s%d=%d", x, op, y, x * y);
                break;
            case "/":
                System.out.printf("%d%s%d=%3.2f", x, op, y, x / (float) y);
                break;
            default:
                System.out.printf("%s運算子錯誤!", op);

        }
        input.close();
    }
}
