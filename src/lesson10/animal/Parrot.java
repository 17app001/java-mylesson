package lesson10.animal;

/**
 * 鸚鵡類別
 * 擁有自有的winds屬性跟fly方法
 */
public class Parrot extends Animal {
    protected int winds;

    public Parrot(String name, double weight) {
        super(name, weight);
        winds = 2;
    }

    public void fly() {
        System.out.printf("我有%d個翅膀，我會飛%n", winds);
    }

}
