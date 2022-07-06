package lesson9;

import lesson9.animal.*;

/**
 * 動物園類別
 */
public class Zoo {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("小兔", 3.5);
        Fox fox = new Fox("小狐", 15);
        Pandas pandas = new Pandas("旺財", 35);
        Parrot parrot = new Parrot("阿飛", 8);

        pandas.eat();
        // 向上轉型(父物件=子物件)
        Animal animal = parrot;
        System.out.println(animal);
        // 取用子類別覆寫的方法
        animal.eat();
        // 父類別不會知道子類別特有的屬性跟方法
        // 讓父類別可以取用到子類別特有的方法跟屬性(向下轉型)
        // ((子類別)父物件).子類別獨有的方法
        ((Parrot) animal).fly();

        System.out.println("============================");
        checkAnimal(rabbit);
        checkAnimal(fox);
        checkAnimal(pandas);
        checkAnimal(parrot);

        System.out.println("============================");
        // 多型
        Animal[] animals = { rabbit, fox, pandas, parrot, new Pandas(),
                new Parrot("金剛鸚鵡", 10.5), new Fox(),
                new Rabbit("暴牙", 6.6) };

        System.out.println(animals.length);

        Pandas pandas1 = new Pandas("旺財", 35);
        Parrot parrot1 = new Parrot("阿飛", 8);

        checkAnimal(pandas1);
        checkAnimal(parrot1);

        // 使用迴圈進行查找
        for (Animal a : animals) {
            System.out.println(a);
            a.eat();
            if (a instanceof Parrot) {
                ((Parrot) a).fly();
            }
            if (a instanceof Pandas) {
                ((Pandas) a).attack();
            }
        }

        System.out.println("動物園目前共有" + Animal.getCounter() + "隻動物!");
    }

    // 多型
    public static void checkAnimal(Animal animal) {
        System.out.println(animal);
        animal.eat();

        if (animal instanceof Pandas) {
            ((Pandas) animal).attack();
        }

        if (animal instanceof Parrot) {
            ((Parrot) animal).fly();
        }
    }
}
