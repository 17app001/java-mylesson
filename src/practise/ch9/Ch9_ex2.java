package practise.ch9;

public class Ch9_ex2 {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println(v1);

        Car c1 = new Car();
        System.out.println(c1);

        Car c2 = new Car(4, 50);
        c2.setLoader(4);
        System.out.println(c2);

        Truck t1 = new Truck(6, 200, 2, 50);

        System.out.println(t1);

        // 擺放至陣列
        Vehicle[] vs = { v1, c1, t1 };

        for (Vehicle v : vs) {
            System.out.println("=============================");
            checkCar(v);
        }
    }

    public static void checkCar(Vehicle v) {

        System.out.println(v.getWheels() + " " + v.getWeight());

        if (v instanceof Truck) {
            System.out.println(v.getClass().getName() + " Truck payload:" + ((Truck) v).getPayload());
        } else if (v instanceof Car) {
            System.out.println(v.getClass().getName() + " Car loader:" + ((Car) v).getLoader());
        }

    }
}
