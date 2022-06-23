package lesson5;

/**
 * 樂透產生器
 */
public class Ch5_11 {
    public static void main(String[] args) {
        int[][] lotto = new int[10][7];

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto[i].length; j++) {
                // 取得1~49(包含49的亂數)
                lotto[i][j] = (int) (Math.random() * 49) + 1;
            }
        }

        for (int[] number : lotto) {
            for (int n : number) {
                System.out.printf("%2d|", n);
            }
            System.out.println();
        }

    }
}
