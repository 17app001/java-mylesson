package practise;

public class Ch6_ex2 {
    public static void main(String[] args) {

        System.out.println(findMax(new int[] { 10, 20, 30, 40, 60 }));
        System.out.println(findMax(new double[] { 10, 20, 30, 40, 60 }));
        System.out.println(findMax(new char[] { 'A', 'B', 'C', 'D', 'E' }));
    }

    public static char findMax(char[] n) {
        char max = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        return max;
    }

    public static double findMax(double[] n) {
        double max = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        return max;

    }

    public static int findMax(int[] n) {
        int max = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        return max;

    }
}
