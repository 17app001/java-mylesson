package lesson3;

/**
 * 遞增運算
 * 前置跟後置
 */
public class Ch3_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 5;

        // 後置運算
        b = a++; // a=a-1(9)
        System.out.printf("a=%d b=%d%n", a, b);

        int d = (b++) + (++c);
        System.out.println(d + "," + b + "," + c);

    }
}
