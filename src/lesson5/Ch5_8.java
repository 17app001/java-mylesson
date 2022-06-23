package lesson5;

import java.util.Arrays;

/**
 * for & foreach & Arrays.toString
 */
public class Ch5_8 {
    public static void main(String[] args) {
        String[] names = { "jerry", "kevin", "mary" };

        System.out.println(names);
        System.out.println(names[0]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("==========================");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("==========================");
        System.out.println(Arrays.toString(names));

        double[][] scores = {
                { 100.0, 88.0, 77.0 },
                { 66.0, 77.0, 55.0 },
                { 76.0, 56.0, 45.5 }
        };

        System.out.println("----------------------------");
        System.out.println(scores);
        System.out.println(scores[0]);
        System.out.println(scores[0][0]);
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf(scores[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (double[] score : scores) {
            for (double s : score) {
                System.out.print(s + ",");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(Arrays.toString(scores[i]));
        }
        System.out.println("----------------------------");
        for (double[] score : scores) {
            System.out.println(Arrays.toString(score));
        }
    }
}
