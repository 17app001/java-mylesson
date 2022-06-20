package test;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = 0;
        while (true) {
            number = rand.nextInt(10) + 1;
            System.out.println(number);
            if (number == 1) {
                break;
            }
        }

        System.out.println(number);
    }
}
