package lesson10;

/***
 * 完整實作兩個抽象方法
 */
public class SuperCircle extends Circle {

    SuperCircle(double radius) {
        super(radius);
    }

    @Override
    public double getPerimeter() {
        area = radius * 2 * Math.PI;
        return area;
    }

    @Override
    public double getArea() {
        area = radius * radius * Math.PI;
        return area;
    }

}
