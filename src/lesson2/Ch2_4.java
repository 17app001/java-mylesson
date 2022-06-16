package lesson2;

/**
 * 字串測試
 */
public class Ch2_4 {
    public static void main(String[] args) {
        // char x = 'A';
        // System.out.println(x == 66);
        String name = "Jerry";
        String name1 = "Jerry";
        String name2 = new String("Jerry");

        // 物件 == 記憶體位置是否相等
        System.out.println(name + "," + name1 + "," + name2);
        System.out.println(name == name2);
        // 物件值的比對使用equals
        System.out.println(name.equals(name1));

        System.out.println("========================");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
