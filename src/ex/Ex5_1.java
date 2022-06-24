package ex;

public class Ex5_1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 1, -100, 1000, 10, 10,
                -1000, 55, 66, 66, 66 };
        int count = 0, temp = 0;
        int mode = 0, modeCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (temp == numbers[j]) {
                    count++;
                }
            }
            // 紀錄最大眾數(次數跟值)
            if (count >= modeCount) {
                mode = temp;
                modeCount = count;
            }

            System.out.println(temp + "," + count);
        }
        System.out.println("=============================");
        System.out.println(mode + "," + modeCount);
    }
}
