package lesson5;

public class Ch5_10 {
    public static void main(String[] args) {
        // 0~1的浮點數
        double rand = Math.random();
        System.out.println(rand);
        System.out.println(rand * 10);
        // 0~10 =>1~11(10)
        System.out.println((int) (rand * 10) + 1);
        // 1~50(1,2,....49)
        System.out.println((int) (rand * 49) + 1);

        // 20~101 20,100
        System.out.println((int) (rand * (100 - 20 + 1)) + 20);
        int start = 10;
        int end = 13;
        // 1~3
        System.out.println((int) (Math.random() * (end - start + 1)) + start);

    }
}
