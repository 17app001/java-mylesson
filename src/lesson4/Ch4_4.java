package lesson4;

/**
 * for迴圈的使用
 */
public class Ch4_4 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + (i + 1));
        }

        System.out.println("=====================");

        // 0~100的偶數總和
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                total += i;
            }
        }

        System.out.println(total);

    }
}
