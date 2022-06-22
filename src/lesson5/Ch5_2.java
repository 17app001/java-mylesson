package lesson5;

public class Ch5_2 {
    public static void main(String[] args) {
        int[] x = new int[5];
        // 記憶體位置
        System.out.println(x);
        // 取長度
        System.out.println(x.length);
        // 位置取值
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        // 取最後一個位置
        System.out.println(x[x.length - 1]);
        System.out.println("=================");
        x[0] = 100;
        x[x.length - 1] = 99;
        // 迴圈取值
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");
        }
    }
}
