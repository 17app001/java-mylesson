package lesson8;

public class Circle {
    /**
     * 成員屬性區
     */
    double radius;

    /**
     * 成員方法區
     */
    // 預設建構式(空建構式)
    Circle() {
        radius = 0.5;
    }

    // 建構式2(多載)
    Circle(double newRadius) {
        radius = newRadius;
    }

    // 園面積
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
