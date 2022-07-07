package practise.ch10;

import java.util.Scanner;

interface Shape {
    double getArea();
}

class Circle implements Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Rectangle implements Shape {

    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {

        return width * height;
    }
}

class Tapzoid implements Shape {
    // 上底,下底,高
    private double upSide, downSide, high;

    Tapzoid(double upSide, double downSide, double high) {
        this.upSide = upSide;
        this.downSide = downSide;
        this.high = high;
    }

    public double getArea() {
        return (upSide + downSide) * high / 2;
    }
}

public class Ch10_ex1 {

    public static void main(String[] args) {

        Shape shape = null;
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("============================");
            System.out.println("請選擇要計算哪個面積");
            System.out.println("(1)方形");
            System.out.println("(2)圓形");
            System.out.println("(3)梯形");
            System.out.println("(4)離開");

            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("請輸入長跟寬");
                double height = input.nextDouble();
                double width = input.nextDouble();
                shape = new Rectangle(width, height);

            } else if (choice == 2) {
                System.out.println("請輸入半徑");
                double radius = input.nextDouble();

                shape = new Circle(radius);
            } else if (choice == 3) {
                System.out.println("請輸入上底/下底/高");
                double upSide = input.nextDouble();
                double downSide = input.nextDouble();
                double high = input.nextDouble();
                shape = new Tapzoid(upSide, downSide, high);
            } else {
                break;
            }

            System.out.println("面積為:" + shape.getArea());

        }
        input.close();

    }
}
