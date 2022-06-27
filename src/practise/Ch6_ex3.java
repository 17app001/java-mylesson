package practise;

import java.util.Scanner;

public class Ch6_ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("請輸入一個數字(質數檢查):");
            int number = input.nextInt();
            if (isPrime(number)) {
                System.out.println(number + " 是質數");
            } else {
                System.out.println(number + " 不是質數");
            }
        }
        input.close();
    }

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            if (count > 2)
                break;
        }
        if (count == 2)
            return true;
        return false;
    }
}
