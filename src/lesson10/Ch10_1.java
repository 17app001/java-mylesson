package lesson10;

import lesson10.shape.Circle;
import lesson10.shape.Rectangle;
import lesson10.shape.Shape;
import lesson10.shape.SuperCircle;

public class Ch10_1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(100, 200);

        Shape[] shapes = { rectangle, new SuperCircle(10.0) };

        for (Shape s : shapes) {
            System.out.println(s.getArea());
            // 判斷型態是否是繼承於Circle(子類別)
            if (s instanceof Circle) {
                Circle c = (Circle) s;

                System.out.println(c.getPerimeter());
                System.out.println(c.getRadius());
            }
        }
    }
}
