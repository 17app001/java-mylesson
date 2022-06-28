package lesson8;

/**
 * 使用陣列存取物件
 */
public class Ch8_3 {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = new int[3];
        y[0] = 1;
        y[1] = 2;
        y[2] = 3;

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        for (int i : y) {
            System.out.println(i);
        }

        System.out.println("===========================");

        TV[] samples = new TV[3];

        TV t1 = new TV();
        TV t2 = new TV(10, 5);
        TV t3 = new TV(10, 5);
        t3.setBrand("Samsung");

        samples[0] = t1;
        samples[1] = t2;
        samples[2] = t3;
        for (TV tv : samples) {
            System.out.println(tv.getInfo());
        }

        System.out.println("=====================================");
        TV[] tvs = new TV[100];
        for (int i = 0; i < tvs.length; i++) {
            tvs[i] = new TV();
            tvs[i].setBrand("SAMSUNG");
            tvs[i].turnOn();
            tvs[i].setChannel(10);
            tvs[i].setVolume(2);
            tvs[i].turnOff();
        }

        for (TV tv : tvs) {
            System.out.println(tv.getInfo());
        }

    }
}
