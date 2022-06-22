package lesson5;

public class Ch5_3 {
    public static void main(String[] args) {
        int[] scores = { 100, 99, 87, 77 };
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]=%d%n", i, scores[i]);
        }

        int[] x = new int[5];
        System.out.println(x);

        double[] y = { 1, 2, 3, 4, 5 };
        y[0] = 9999;
        System.out.println(y);

        int[] z = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(z);
    }
}
