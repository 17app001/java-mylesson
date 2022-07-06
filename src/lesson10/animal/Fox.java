package lesson10.animal;

/**
 * 繼承一定要呼叫父類的建構式
 * super取用父類別
 */
public class Fox extends Animal implements Skill {

    public Fox() {

    }

    public Fox(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("我喜歡吃肉!");
    }

    @Override
    public void sound() {
        System.out.println("嗚嗚嗚嗚嗚..");
    }

    @Override
    public void sleep() {
        System.out.println("我是夜行性動物(白天睡覺)");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("我跑超級快!");
    }

    @Override
    public void skill() {
        System.out.println("我會到處鑽洞!");
    }

}
