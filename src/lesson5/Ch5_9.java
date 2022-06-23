package lesson5;

public class Ch5_9 {
    public static void main(String[] args) {
        int[][] scores = new int[3][];

        scores[0] = new int[3];
        scores[1] = new int[4];
        scores[2] = new int[5];

        for (int[] score : scores) {
            for (int s : score) {
                System.out.print(s + ",");
            }
            System.out.println();
        }
    }
}
