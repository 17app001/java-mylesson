package lesson12;

import java.util.Arrays;
import java.util.ArrayList;

public class Ch12_1 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "jerry";
        names[1] = "kevin";
        names[2] = "Michael";

        System.out.println(Arrays.toString(names));
        System.out.println(names[2]);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("================================");
        // 使用集合ArrayList(add,get,size,remove)
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("jerry");
        nameList.add("kevin");
        nameList.add("Michael");
        nameList.add("Tony");
        nameList.add("JJ");

        System.out.println(nameList);

        String name = nameList.get(0);
        System.out.println(nameList.size());
        System.out.println(nameList.get(nameList.size() - 1));
        System.out.println(name + "," + nameList.get(nameList.size() - 1));
        System.out.println(nameList.size());

        // add,size,get,contains,isEmpty,set,indexOf,remove(index),remove(object)
        System.out.println("==================================================");

        System.out.println(nameList.isEmpty());
        nameList.set(0, "JERRY");
        System.out.println(nameList.indexOf("Jerry"));
        nameList.remove(1);
        nameList.remove("Tony1");

        System.out.println(nameList + "\n" + nameList.size());
        System.out.println("==================================================");

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        for (String n : nameList) {
            System.out.println(n);
        }

        nameList.forEach(n -> System.out.println(n));

        nameList.forEach(n -> {
            n = "Mr." + n;
            System.out.println(n);
        });

    }
}
