package lesson6;

/***
 * 傳遞類陣列型態使用 型態... ==> int...
 */
public class Ch6_4 {
    public static void main(String[] args) {
        double x = sum(1);
        double y = sum(1, 2);
        double z = sum(1, 2, 3);

        System.out.println(x + "," + y + "," + z);
        System.out.println(max(10, 20));
        System.out.println(max(10, 11, -1000, -100, 1000));

        System.out.println("=======================");
        System.out.println(total(100));
        System.out.println(total(2, 100));
        System.out.println(total(2, 100, 2));
        System.out.println(total(2, 100, 2, 1));
        System.out.println(total());
    }

    public static int total(int... args) {
        int start = 0, end = 0, step = 1;
        int size = args.length;
        if (size == 1) {
            end = args[0];
        } else if (size == 2) {
            start = args[0];
            end = args[1];
        } else if (size == 3) {
            start = args[0];
            end = args[1];
            step = args[2];
        } else {
            System.out.println("參數個數有誤!");
            return -3;
        }

        if (start > end) {
            System.out.println("起始值大於終止值!");
            return -1;
        }

        if (step > end) {
            System.out.println("step error!");
            return -2;
        }

        int total = 0;
        for (int i = start; i < end + 1; i += step) {
            total += i;
        }

        System.out.printf("%d~%d=%d%n", start, end, total);

        return total;

    }

    public static int max(int a, int... b) {
        int bigger = a;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > bigger) {
                bigger = b[i];
            }
        }

        return bigger;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    public static double sum(double... nums) {
        double total = 0;
        for (double i : nums) {
            total += i;
        }

        return total;
    }
}
