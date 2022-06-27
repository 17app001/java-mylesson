package lesson7;

/**
 * charAt(index) 取單一字元
 * toCharArray() 取字元陣列
 * new String(char[]) 傳入字元陣列
 */
public class Ch7_1 {
    public static void main(String[] args) {
        String s1 = "Jerry";
        String s2 = new String("Jerry");
        String s3 = "Jerry";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + ",");
        }
        System.out.println();

        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ",");
        }
        System.out.println();
        for (char c : chars) {
            System.out.print(c + ",");
        }

        String s4 = new String(chars);
        System.out.println(s4);

    }
}
