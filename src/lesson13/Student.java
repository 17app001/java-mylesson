package lesson13;

public class Student implements Comparable<Student> {
    private String name;
    private double[] scores;
    // 靜態屬性
    private static int count;

    public static void main(String[] args) {
        Student s = new Student("Jerry");
        s.setScores(new double[] { 100, 66, 56, 64, 100, 77.7 });

        System.out.println(s.toString());
    }

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
    // 輸出格式==> Jerry,100,77,88
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(",");

        for (int i = 0; i < scores.length; i++) {
            if (i == scores.length - 1) {
                stringBuilder.append(scores[i]).append("\n");
            } else {
                stringBuilder.append(scores[i]).append(",");
            }
        }

        return stringBuilder.toString();
    }

    // A,B,C
    // 77.5,66,1OO ==>66,77.5,100
    // 0==>兩個值相等,1==>我比較大(交換位置),-1==>我比較小(位置不變)
    @Override
    public int compareTo(Student o) {
        return getAvg(this) == getAvg(o) ? 0 : getAvg(this) > getAvg(o) ? 1 : -1;
    }
}
