package practise.ch9;

public class Truck extends Car {

    private int payload;

    public Truck(int wheels, double weight, int loader, int payload) {
        super(wheels, weight);
        setLoader(loader);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString() + " Truck{" +
                "payload=" + payload +
                '}';
    }
}
