package lesson6;

/**
 * 函式宣告
 * static =>靜態唯一
 * public =>全公開
 * package =>該package內可以使用(移除修飾字)
 * 外部package使用時需要import packageName
 * ex:
 * import lesson6.Ch6_1;
 * Ch6_1.sum(10,20);
 */
public class Ch6_1 {
    public static void main(String[] args) {
        // System.out.println(args);
        // sum(100, 200);
        // end
        total(100);
        // start,end
        total(2, 100);
        int total1 = total(2, 100, 1);
        // start,end,step
        System.out.println("===================================");
        System.out.println(total(1, 100, 2));

        int total2 = total(100, 1000, 2);
        System.out.println("總和為:" + (total1 + total2));
        System.out.println(sum(10, 20));

        System.out.println("---------------------");
        System.out.println(total(100, 1000, 1001));
    }

    // 宣告自己的方法(函式)
    public static int sum(int x, int y) {
        int total = x + y;
        System.out.println("總計為:" + total);
        return total;
    }

    /***
     * 起始值永遠為0,步進值永遠為1
     * 
     * @param end
     * @return
     */
    public static int total(int end) {
        int start = 0, step = 1;
        if (start > end) {
            System.out.println("起始值大於終止值!");
            return -1;
        }

        if (step > end) {
            System.out.println("step error!");
            return -2;
        }

        int total = 0;
        for (int i = start; i < end + 1; i += step) {
            total += i;
        }

        System.out.printf("%d~%d=%d%n", start, end, total);

        return total;
    }

    /**
     * 步進值永遠為1
     * 
     * @param end
     * @return
     */
    public static int total(int start, int end) {
        int step = 1;
        if (start > end) {
            System.out.println("起始值大於終止值!");
            return -1;
        }

        if (step > end) {
            System.out.println("step error!");
            return -2;
        }

        int total = 0;
        for (int i = start; i < end + 1; i += step) {
            total += i;
        }

        System.out.printf("%d~%d=%d%n", start, end, total);

        return total;
    }

    /**
     * 計算總和的函式
     * 
     * @param start (起始值)
     * @param end   (終止值)
     * @param step  (步進值)
     * @return 回傳結果(<=-1 error)
     */
    public static int total(int start, int end, int step) {
        if (start > end) {
            System.out.println("起始值大於終止值!");
            return -1;
        }

        if (step > end) {
            System.out.println("step error!");
            return -2;
        }

        int total = 0;
        for (int i = start; i < end + 1; i += step) {
            total += i;
        }

        System.out.printf("%d~%d=%d%n", start, end, total);

        return total;
    }
}
