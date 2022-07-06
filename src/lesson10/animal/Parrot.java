package lesson10.animal;

/**
 * 鸚鵡類別
 * 擁有自有的winds屬性跟fly方法
 */
public class Parrot extends Animal implements Fly, Skill {

    public Parrot(String name, double weight) {
        super(name, weight);

    }

    public void fly() {
        System.out.printf("我有%d個翅膀，我會飛%n", Fly.WINGS);
    }

    @Override
    public void eat() {
        System.out.println("我吃蟲子");
    }

    @Override
    public void sound() {
        System.out.println("呱呱叫!");
    }

    @Override
    public void skill() {
        System.out.println("我也會說話");
    }

}
