package lesson2;

/**
 * 強制轉型
 */
public class Ch2_8 {
    public static void main(String[] args) {
        float x = 10.5f;
        double y = x;
        float z = (float) y;

        System.out.println(x + "," + y + "," + z);
        System.out.println(58 / Math.pow(165 / 100, 2));
        int a = (int) x;
        // 轉換錯誤
        int b = (short) 32768;

        System.out.println(a + "," + b);

    }
}
