package lesson11;

import java.util.Arrays;

public class Student {
    private String name;
    private double[] scores;
    // 靜態屬性
    private static int count;

    // 產生建構式(可以傳入姓名)
    public Student(String name) {
        this.name = name;
        count++;
    }

    // 取得產生學生物件總數
    public static int getCounter() {
        return count;
    }

    // 請你產生getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    // 平均分方法(類別方法)
    public static double getAvg(Student student) {
        double total = 0;
        double[] scores = student.getScores();
        for (double score : scores) {
            total += score;
        }

        return total / scores.length;
    }

    // 請你覆載toString方法(輸出name,scores)
    // 回傳String ==>Arrays.toString()
    @Override
    public String toString() {
        return String.format("%s scores:%s",
                name, Arrays.toString(scores));
    }

    // 產生一個靜態方法，可以計算同學的平均分並傳回
}
