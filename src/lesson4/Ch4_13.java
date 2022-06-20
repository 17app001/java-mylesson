package lesson4;

/**
 * flag+break
 */
public class Ch4_13 {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        boolean flag = false;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                for (k = 0; k < 10; k++) {
                    if (i == 5 && j == 5 && k == 5) {
                        flag = true;
                        System.out.println(flag);
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        System.out.printf("i=%d j=%d k=%d", i, j, k);
    }
}
