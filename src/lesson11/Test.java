package lesson11;

public class Test {
    public static void main(String[] args) {

        // 0,1,-1
        int result = 0;
        int x = 2;
        int y = 3;

        result = x == y ? 0 : x > y ? 1 : -1;

        System.out.println(result);

        System.out.println("------------------");

        if (x == y) {
            result = 0;
        } else if (x > y) {
            result = 1;
        } else {
            result = -1;
        }

        System.out.println(result);
    }
}
