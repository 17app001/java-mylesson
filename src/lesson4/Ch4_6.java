package lesson4;

/**
 * 雙迴圈測試
 * 
 */
public class Ch4_6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j=" + j);
                count++;
            }
        }
        System.out.println("======================");
        System.out.println(count);
    }
}
