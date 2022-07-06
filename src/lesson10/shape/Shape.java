package lesson10.shape;

/**
 * 形狀抽象類別
 * 沒有抽象方法是不太正確
 */
public abstract class Shape {
    protected double width;
    protected double height;
    protected double area;

    // 抽象方法子類別必定要實作
    public abstract double getArea();
}
