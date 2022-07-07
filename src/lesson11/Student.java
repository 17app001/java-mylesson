package lesson11;

import java.util.Arrays;

public class Student {
    private String name;
    private double[] scores;

    // 產生建構式(可以傳入姓名)
    Student(String name) {
        this.name = name;
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

    // 請你覆載toString方法(輸出name,scores)
    // 回傳String ==>Arrays.toString()
    @Override
    public String toString() {
        return String.format("%s scores:%s",
                name, Arrays.toString(scores));
    }

    // 產生一個靜態方法，可以計算同學的平均分並傳回
}
