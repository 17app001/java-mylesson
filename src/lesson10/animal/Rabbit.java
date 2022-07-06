package lesson10.animal;

/**
 * 兔子類別
 * 繼承之後可以
 * [1]覆寫方法(同名稱/參數)將隱藏父類別同名方法
 * [2]使用super.方法(可以取用出父類別的方法)
 */
public class Rabbit extends Animal {

    public Rabbit() {
        super();
        sex = FEMALE;
    }

    public Rabbit(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sleep() {
        System.out.println("我很愛睡覺~");
    }

    @Override
    public void run() {
        System.out.println("我跑很快!");
    }

    public void eat() {
        super.eat();
        System.out.println("我喜歡吃草!");
    }

    // 多載
    public void eat(String food) {
        System.out.println("我更喜歡吃" + food);
    }
}
