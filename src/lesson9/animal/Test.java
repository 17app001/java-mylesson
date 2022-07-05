package lesson9.animal;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        System.out.println(r.sex);
        r.sex = Animal.MALE;

        System.out.println(r.sex);
    }
}
