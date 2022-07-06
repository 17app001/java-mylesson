package practise.ch8;

public class Ch8_ex2 {

    public static void main(String[] args) {

        BMI bmi = new BMI("Jerry", 35, 58, 165);

        System.out.println(bmi.getBMI());
        System.out.println(bmi.getStatus());

        bmi = new BMI("Mary", 48, 155);

        System.out.println(bmi.getBMI());
        System.out.println(bmi.getStatus());

    }
}
