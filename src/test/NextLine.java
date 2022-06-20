package test;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        while ((name = scanner.nextLine()).equals(""))
            ;

        float score = scanner.nextFloat();

        while ((name = scanner.nextLine()).equals(""))
            ;
        System.out.println(name + "," + score);

        scanner.close();
    }
}
