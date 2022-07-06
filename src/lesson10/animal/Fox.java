package lesson10.animal;

/**
 * 繼承一定要呼叫父類的建構式
 * super取用父類別
 */
public class Fox extends Animal {

    public Fox() {

    }

    public Fox(String name, double weight) {
        super(name, weight);
    }

    // 覆載(override)
    public void eat() {
        System.out.println("我喜歡吃肉!");
    }

    // 覆載(override)
    public void sleep() {
        System.out.println("我是夜行性動物(白天睡覺)");
    }

    // 覆載(override)
    public void run() {
        super.run();
        System.out.println("我跑超級快!");
    }

}
