package lesson10.animal;

public class Pandas extends Animal {

    public Pandas() {

    }

    public Pandas(String name, double weight) {
        super(name, weight);
    }

    public void attack() {
        System.out.println("我可是功夫熊貓!");
    }

    public void eat() {
        System.out.println("我喜歡吃竹子");
    }
}
