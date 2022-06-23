
public class App {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("Jerry");
        System.out.println("165");
        System.out.println("58");

        // CTRL+/
        // 計算BMI(BMI = 體重(公斤) / 身高2(公尺2))
        System.out.println(58 / ((165.0 / 100) * (165.0 / 100)));

    }
}
