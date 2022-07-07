package lesson11;

import java.util.Arrays;

public class Student implements Comparable<Student> {
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
    // 產生一個靜態方法，可以計算同學的平均分並傳回
    public static double getAvg(Student student) {
        double total = 0;
        double[] scores = student.getScores();
        for (double score : scores) {
            total += score;
        }

        return total / scores.length;
    }

    @Override
    public String toString() {
        return String.format("%s scores:%s",
                name, Arrays.toString(scores));
    }

    // A,B,C
    // 77.5,66,1OO ==>66,77.5,100
    // 0==>兩個值相等,1==>我比較大(交換位置),-1==>我比較小(位置不變)
    @Override
    public int compareTo(Student o) {
        return getAvg(this) == getAvg(o) ? 0 : getAvg(this) > getAvg(o) ? 1 : -1;
    }
}
