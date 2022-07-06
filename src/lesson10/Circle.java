package lesson10;

/***
 * 類別繼承抽象類別後也可以抽象化
 * 1.不一定要實作父類別的抽象方法
 * 2.最終實體化的類別需要完整實作所有抽象方法
 */
public abstract class Circle extends Shape {
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    protected abstract double getPerimeter();

    public double getRadius() {
        return radius;
    }
}
