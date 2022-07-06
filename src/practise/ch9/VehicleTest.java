package practise.ch9;

public class VehicleTest {

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
    }
}
