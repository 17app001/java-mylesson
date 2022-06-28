package lesson8;

/**
 * 記憶體位置的參照
 */
public class Ch8_2 {
    public static void main(String[] args) {
        TV t1 = null;
        TV t2 = new TV();
        t1 = t2;
        TV t3 = new TV(10, 8);
        t2 = t3;
        t1 = t3;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2);
        System.out.println(t2 == t3);
        System.out.println(t3 == t1);
    }
}
