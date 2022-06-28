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
    public Circle() {
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

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    /***
     * 半徑設定(>0 以及 <=1000)")
     * 
     * @param newRadius
     */
    public void setRadius(double newRadius) {
        if (newRadius > 0 && newRadius <= 1000) {
            radius = newRadius;
        } else {
            System.out.println("半徑設定錯誤(>0 && <=1000)");
        }
    }
}
