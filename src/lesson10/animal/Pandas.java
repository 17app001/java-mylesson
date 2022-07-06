package lesson10.animal;

public class Pandas extends Animal implements Fly, Skill {

    public Pandas() {

    }

    public Pandas(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sound() {
        System.out.println("嚶嚶嚶....");
    }

    @Override
    public void skill() {
        System.out.println("我可是會功夫!");
    }

    @Override
    public void eat() {
        System.out.println("我喜歡吃竹子");
    }

    @Override
    public void fly() {
        System.out.println("我也會飛~~~~!");
    }
}
