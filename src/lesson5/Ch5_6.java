package lesson5;

/**
 * 二維陣列
 */
public class Ch5_6 {
    public static void main(String[] args) {
        // 一個同學，三科分數
        int[] scores = { 100, 88, 77 };
        System.out.println(scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[scores.length - 1]);
        // 單迴圈取一維
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ",");
        }
        System.out.println("\n===============================");
        // 三個同學，N科分數
        int[][] scores2 = {
                { 100, 88, 77 },
                { 77, 66, 55 },
                { 100, 100 },
                { 99, 77, 88 },
                { 33, 33, 44, 65 },
        };
        // 使用[][]取值
        System.out.println(scores2.length);
        System.out.println(scores2[0]);
        System.out.println(scores2[0][0]);
        System.out.println(scores2[2][1]);
        System.out.println(scores2[4][3]);
        // 最後一列(一維)
        System.out.println(scores2[scores2.length - 1]);
        // 最後一列的最後一個位置
        System.out.println(scores2[scores2.length - 1].length - 1);
        // 取出最後一列最後一行的值
        System.out.println(scores2[scores2.length - 1][scores2[scores2.length - 1].length - 1]);
        // 雙迴圈輸出
        System.out.println("\n===============================");
        for (int i = 0; i < scores2.length; i++) {
            for (int j = 0; j < scores2[i].length; j++) {
                System.out.println(scores2[i][j]);
            }
        }
    }
}
