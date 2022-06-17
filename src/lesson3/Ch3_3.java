package lesson3;

/**
 * 遞增運算
 * 前置跟後置
 */
public class Ch3_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        a++;
        --a;

        System.out.println(b - 5);
        b = b - 5;
        b -= 5;
        System.out.println(b);

        a = a + (b = b - 5);
        a += b -= 5;

        System.out.println(a + "," + b);

        a += 5; // a = a + 5;
        System.out.println(a);

        // 後置運算
        b = a++; // a=a-1(9)
        System.out.printf("a=%d b=%d%n", a, b);

        int d = (b++) + (++c);
        System.out.println(d + "," + b + "," + c);

    }
}
