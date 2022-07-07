package lesson11;

public class Ch11_3 {
    public static void main(String[] args) {
        System.out.println(div(10, 0));

        try {
            div2(10, 0);
        } catch (ArithmeticException ex) {
            System.out.println("by zero error!");
        }

        System.out.println("done!");
    }

    // 丟出例外
    public static int div2(int x, int y) throws ArithmeticException {
        return x / y;
    }

    public static int div(int x, int y) {
        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            System.out.println("數值錯誤！");
        }

        return result;
    }
}
