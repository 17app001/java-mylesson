package lesson4;

/**
 * while or for?
 */
public class Ch4_9 {
    public static void main(String[] args) {

        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("======================");

        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("end.");
    }
}
