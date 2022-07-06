package practise.ch9;

public class Car extends Vehicle {
    // 最大載客數
    final static int MAX_LOADER = 4;
    // 載客數
    private int loader;

    Car() {
        super(4, 20.0);
        setLoader(4);
    }

    Car(int wheels, double weight) {
        super(wheels, weight);
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
        if (loader > MAX_LOADER) {
            this.loader = MAX_LOADER;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Taxi{" +
                "loader=" + loader +
                '}';
    }
}
