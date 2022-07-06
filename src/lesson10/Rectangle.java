package lesson10;

public class Rectangle extends Shape {
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        area = width * height;

        return area;
    }
}
