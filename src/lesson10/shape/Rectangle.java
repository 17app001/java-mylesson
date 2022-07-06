package lesson10.shape;

public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        area = width * height;

        return area;
    }
}
