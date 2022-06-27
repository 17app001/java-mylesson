package lesson7;

/***
 * StringBuffer -多執行緒
 * StringBuilder -單執行緒
 */
public class Ch7_6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jerry\t");
        sb.append(38).append('\t').append("Taipei").append('\t').append(168);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        String result = sb.toString();
        System.out.println(result);

        sb.delete(0, 5);
        System.out.println(sb.toString());

        sb.insert(0, "Mary");
        System.out.println(sb.toString());

        sb.replace(0, 4, "Mario");
        System.out.println(sb.toString());

        int[] array = { 1, 2, 3, 4, 5 };
        result = arrayToString(array);

        System.out.println(result);
    }

    /**
     * int[] array={1,2,3,4,5}
     * 輸出 "{1,2,3,4,5}"
     * 
     * @param array
     * @return
     */
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
                continue;
            }
            sb.append(array[i]).append(",");
        }

        sb.append("}");
        return sb.toString();
    }
}
