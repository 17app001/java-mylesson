package lesson2;

/**
 * �Q���p��
 */
public class Ch2_6 {
    public static void main(String[] args) {
        float rate = 0.02f;
        int money = 50000;
        // �~�Q��
        float interest = money * rate;
        // ���Q�M
        double amount = money + interest;
        String name = "�i�T";

        System.out.printf("�s�ڤH:%-10s �s�ڪ��B:%+08d �~�Q�v:%6.2f%% " +
                "�~�Q��:%.2f ���Q�M:%,.2f%n", name, money, rate, interest, amount);

        System.out.printf("�p�⵲��");
    }

}