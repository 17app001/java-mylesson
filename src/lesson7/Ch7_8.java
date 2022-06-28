package lesson7;

import lesson8.*;

public class Ch7_8 {

    public static void main(String[] args) {
        Circle c = new Circle();

        c.setRadius(0.00001);

        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}