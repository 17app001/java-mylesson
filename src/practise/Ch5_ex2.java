package practise;

public class Ch5_ex2 {
    public static void main(String[] args) {

        int[][] lotto = new int[10][5];
        for (int i = 0; i < lotto.length; i++) {
            int count = 0;
            do {
                boolean repeat = false;
                int rand = (int) (Math.random() * 49) + 1;
                // 使用迴圈檢查是否有重複的值
                for (int j = 0; j < lotto[i].length; j++) {
                    if (lotto[i][j] == rand) {
                        repeat = true;
                        break;
                    }
                }
                if (!repeat) {
                    lotto[i][count] = rand;
                    count++;
                }

            } while (count < lotto[i].length);
        }

        int count = 0;
        for (int i[] : lotto) {
            System.out.println("第" + (++count) + "期");
            for (int j : i) {
                System.out.printf("%-3d", j);
            }
            System.out.println();
        }
    }
}
