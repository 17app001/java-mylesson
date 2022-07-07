package test;

public class Student implements Comparable<Student> {
    private String name;
    private double[] scores;

    Student(String name) {
        this.name = name;
    }

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

    // 取得平均分
    public static double getAvg(Student student) {
        double total = 0;
        for (double score : student.getScores()) {
            total += score;
        }

        return total / student.getScores().length;
    }

    @Override
    public int compareTo(Student o) {

        return getAvg(this) == getAvg(o) ? 0 : getAvg(this) > getAvg(o) ? 1 : -1;
    }
}
