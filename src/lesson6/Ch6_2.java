package lesson6;

public class Ch6_2 {

    final static int RECTANGLE = 0, TRIANGEL = 1;

    public static void main(String[] args) {
        System.out.println("面積為:" + getArea(10, 20, RECTANGLE));
        System.out.println("面積為:" + getArea(10, 20, TRIANGEL));

        System.out.println("面積為:" + getArea(10.5, 20.5));
        System.out.println("面積為:" + getArea(10.5, 10.5, 10.5));

        System.out.println("面積為:" + getArea(10.5, 10.5, 10.5));
        System.out.println("面積為:" + getArea(10.5));
    }

    // 取圓面積
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 取方形面積
    public static int getArea(int width, int height, int type) {
        int area = 0;
        if (type == RECTANGLE) {
            area = width * height;
        } else if (type == TRIANGEL) {
            area = width * height / 2;
        }

        return area;
    }

    // 取方形面積
    public static float getArea(float width, float height) {
        float area = width * height;
        return area;
    }

    // 取方形面積
    public static double getArea(double width, double height) {
        double area = width * height;
        return area;
    }

    // 取立方體
    public static double getArea(double width, double height, double length) {
        double area = width * height * length;
        return area;
    }
}
