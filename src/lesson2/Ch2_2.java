package lesson2;

/**
 * 基礎型態測試
 */
public class Ch2_2 {
    public static void main(String[] args) {
        float pi = 3.1415926f;
        float radius = 5.5f;
        // radius*radius*pi
        double area = radius * radius * pi;

        System.out.println("半徑為:" + radius);
        System.out.println("圓周率:" + pi);
        System.out.println("園面積:" + area);
        System.out.println("園周長:" + (radius * 2 * pi));
    }
}
