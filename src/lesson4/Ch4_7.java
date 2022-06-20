package lesson4;

/**
 * 九九乘法表(橫板顯示)
 */
public class Ch4_7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                count++;
                System.out.printf("%-2dx %-2d=%2d|", j, i, i * j);
            }
            System.out.println();
        }

        System.out.println("總共跑動" + count + "次");
    }
}
