package ex;

public class Ex3_2 {
    public static void main(String[] args) {
        double amount = 100000;
        double rate = 1.5;

        double yearInterest = amount * (rate / 100);

        System.out.println(Math.round(yearInterest / 12) + "," + (amount + yearInterest));
    }
}
