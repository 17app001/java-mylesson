package lesson5;

/**
 * 三維陣列測試
 */
public class Ch5_12 {
    public static void main(String[] args) {

        // 三個同學，四個學期，三科分數
        int[][][] x = {
                // 學期1(三科分數)
                { { 100, 88, 77 }, { 99, 88, 66 }, { 100, 88, 77 }, { 99, 88, 66 } }, // 同學1
                { { 100, 88, 77 }, { 99, 88, 66 }, { 100, 88, 77 }, { 99, 88, 66 } },
                { { 100, 88, 77 }, { 99, 88, 66 }, { 100, 88, 77 }, { 99, 88, 66 } },
        };

        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[0][0].length);
        System.out.println(x[0][1].length);
        System.out.println(x[0][1][1]);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    System.out.print(x[i][j][k] + ",");
                }
            }
            System.out.println();
        }

        System.out.println("=========================");
        for (int[][] i : x) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k + ",");
                }
            }
            System.out.println();
        }
    }
}
