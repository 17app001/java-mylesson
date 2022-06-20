package lesson4;

/**
 * Math.round/ceil/floor
 * 取小數點方式
 */
public class Ch4_8 {
    public static void main(String[] args) {
        int cost = 99999;
        double discount = .851256677;
        double total = cost * discount;
        System.out.println(total);
        // System.out.printf("%.0f%n", total);
        // System.out.printf("%.2f%n", total);

        System.out.println(Math.ceil(total));
        System.out.println(Math.floor(total));
        System.out.println("=============================");
        System.out.println(Math.round(total));
        long x = Math.round(total);

        System.out.println(x);

        System.out.println(Math.round(total * 10.0) / 10.0);
        System.out.println(Math.round(total * 100.0) / 100.0);
        System.out.println(Math.round(total * 1000.0) / 1000.0);

        double total2 = Math.round(total * 1000.0) / 1000.0;
        System.out.println(total2);
    }
}
