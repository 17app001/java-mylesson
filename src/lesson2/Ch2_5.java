package lesson2;

/*
 * 園面積格式化輸出
 */
public class Ch2_5 {
    public static void main(String[] args) {
        // 常數(不可變)
        final float PI = 3.1415926f;
        // 半徑
        int radius = 5;
        // radius*radius*pi
        double area = radius * radius * PI;

        System.out.printf("半徑為:%10d 圓周率:%8.3f 園面積:%.2f 園周長:%6.2f\n", radius, PI,
                area, radius * 2 * PI);

        System.out.println("半徑為:" + radius + " 圓周率:" + PI + " 園面積:" + area +
                " 園周長:" + (radius * 2 * PI));
    }
}
