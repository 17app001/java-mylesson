package practise;

import java.util.Scanner;

public class Ch6_ex1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("請輸入" + numbers.length + "個數字");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("請輸入第%d個數字:", i + 1);
            numbers[i] = input.nextInt();
        }

        System.out.println();
        // 紀錄最大出現次數的值跟次數
        int maxNumber = 0;
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = getRepeatCount(numbers[i], numbers);
            if (count > maxCount) {
                maxCount = count;
                maxNumber = numbers[i];
            }
        }
        System.out.printf("眾數為:%d (次數為:%d)", maxNumber, maxCount);
        input.close();
    }

    /**
     * 取得數字在陣列出現的個數
     *
     * @param num
     * @param numbers
     * @return
     */
    public static int getRepeatCount(int num, int[] numbers) {
        int count = 0;
        for (int i : numbers) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }
}
