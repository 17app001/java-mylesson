package lesson10.animal;

/**
 * 動物類別(父類別)
 */
public abstract class Animal extends Object implements Cloneable {
    // 靜態且公開的最後常數
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    // 私有屬性
    private String name;
    private double weight;
    // 保護修飾字(方便子類別跟同package可以直接取用)
    protected int sex;

    private static int count;

    // 空建構式(初始化)
    public Animal() {
        name = "no name";
        weight = 0.1;
        sex = MALE;
        count++;
    }

    public static int getCounter() {
        return count;
    }

    // 多載(overload)
    public Animal(String name, double weight) {
        this();
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSex() {
        return this.sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void eat();

    public abstract void sound();

    public void sleep() {
        System.out.println("i like sleeping.");
    }

    public void run() {
        System.out.println("i like running.");
    }

    @Override
    public String toString() {
        return String.format("%s weight:%.2f", name, weight);
    }

    // 覆載
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            // 向下轉型
            Animal animal = (Animal) obj;
            if (animal.name.equals(name) &&
                    animal.sex == sex && animal.weight == weight) {
                return true;
            }
        }

        return false;
    }

    // 多載
    public boolean equals(Animal animal) {
        if (animal.name.equals(name) &&
                animal.sex == sex && animal.weight == weight) {
            return true;
        }

        return false;
    }

    // 覆載得類別修飾子改成更高級別(protected==>public)
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

}
