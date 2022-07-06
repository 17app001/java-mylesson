package lesson10;

import lesson10.animal.*;

/**
 * 測試介面跟多型
 */
public class Ch10_3 {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("阿飛", 8);
        Parrot parrot2 = new Parrot("阿飛", 8);

        Parrot parrot3 = null;

        try {
            parrot3 = (Parrot) parrot.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(parrot3 == parrot);

        parrot3.setName("阿飛3");
        System.out.println(parrot.getName());

        System.out.println("--------------------------");

        // false,false
        System.out.println(parrot == parrot2);
        System.out.println(parrot.equals(parrot2));

        Fox fox = new Fox("小狐", 15);
        Pandas pandas = new Pandas("旺財", 35);

        Animal[] animals = { parrot, fox, pandas };

        for (Animal animal : animals) {
            System.out.println("--------------------------");
            System.out.println(animal);
            animal.eat();
            if (animal instanceof Fly) {
                ((Fly) animal).fly();
            }
            if (animal instanceof Skill) {
                ((Skill) animal).skill();
            }
        }
    }
}
