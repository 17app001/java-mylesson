package lesson7;

import tools.Tool;

public class Ch7_7 {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6 };

        System.out.println(Tool.toString(x));
        System.out.println(Tool.toString(new double[] { 1, 2, 3, 4, 5, 6 }));

        boolean even = true;

        if (even) {
            System.out.println("1");
        }

        int number = 10;
        if (number % 2 == 0) {
            even = true;
        } else {
            even = false;
        }

        System.out.println(even);

        boolean odd = number % 2 == 1;
        System.out.println(odd);

        String result = number % 2 == 0 ? "是偶數" : "不是偶數";
        System.out.println(number + result);

    }
}
