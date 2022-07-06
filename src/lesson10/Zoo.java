package lesson10;

import lesson10.animal.*;

public class Zoo {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("小兔", 3.5);
        Fox fox = new Fox("小狐", 15);
        Pandas pandas = new Pandas("旺財", 35);
        Parrot parrot = new Parrot("阿飛", 8);

        // 多型
        Animal[] animals = { rabbit, fox, pandas, parrot, new Pandas(),
                new Parrot("金剛鸚鵡", 10.5), new Fox(),
                new Rabbit("暴牙", 6.6) };

        System.out.println(animals.length);

        // 使用迴圈進行查找
        for (Animal a : animals) {
            System.out.println(a);
            a.eat();
            a.sound();

            if (a instanceof Parrot) {
                ((Parrot) a).fly();
            }
        }

        System.out.println("動物園目前共有" + Animal.getCounter() + "隻動物!");
    }
}
