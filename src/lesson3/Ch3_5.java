package lesson3;

public class Ch3_5 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        boolean x = false;

        // && ==>短路
        if (a > b && ++c < b) {
            System.out.println(c);
        }

        System.out.println(c);

        if (a < b && !(b > c)) {
            System.out.println(c);
        }

        if (!x) {
            System.out.println(x);
        }
    }
}
