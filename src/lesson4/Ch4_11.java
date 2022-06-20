package lesson4;

public class Ch4_11 {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        i = 0;
        while (i < 10) {
            if (i == 5) {
                break;
            }
            i++;
        }
    }
}
