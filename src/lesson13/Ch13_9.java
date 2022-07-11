package lesson13;

/**
 * 字串切割分析輸出
 */
public class Ch13_9 {
    public static void main(String[] args) {

        String str = "Mary,99.8,99.9,99.7\nJerry,100,77,88";

        String[] datas = str.split("\n");

        for (String data : datas) {
            String[] student = data.split(",");
            String name = student[0];
            double total = 0;

            for (int i = 1; i < student.length; i++) {
                total += Double.valueOf(student[i]);
            }

            double avg = total / (student.length - 1);
            System.out.printf("%10s total:%6.2f avg:%6.2f%n", name, total, avg);

        }

    }
}
