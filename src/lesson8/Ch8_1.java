package lesson8;

public class Ch8_1 {
    public static void main(String[] args) {
        Circle c1 = null;
        Circle c2 = new Circle();
        Circle c3 = new Circle(10);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());

        c2.radius = 3.0;
        System.out.printf("c2的面積為%.2f", c2.getArea());

    }
}
