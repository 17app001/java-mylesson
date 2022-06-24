package ex;

public class Ex4_2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        String op = "X";
        boolean error = false;

        double total = 0;
        switch (op) {
            case "+":
                total = x + y;
                break;
            case "-":
                total = x - y;
                break;
            case "*":
            case "X":
            case "x":
                total = x * y;
                break;
            case "/":
                total = x / (double) y;
                break;

            default:
                error = true;
        }
        if (error) {
            System.out.println("運算子錯誤!");
        }
        System.out.printf("%d%s%d=%.2f", x, op, y, total);
    }
}
