package lesson11;

/**
 * 例外處理
 * 1.RuntimeException 可以不處理，但會導致程式潰堤
 * 2.使用try..catch語句進行包覆處理
 * 3.可以多個例外類別
 * 3.finally為最後區段(可以沒有，不管例外是否發生都會執行，譬如關閉檔案..)
 * 4.例外處理是為了讓程式可以繼續運行的機制
 */
public class Ch11_1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        try {
            System.out.println(10 / 1);
            System.out.println(numbers[numbers.length]);

        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println("除數不能為零");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.out.println("====================");
            System.out.println(ex.getMessage());
            System.out.println("====================");
            ex.printStackTrace();
            System.out.println("====================");
            System.out.println("陣列超出範圍");
        } finally {
            System.out.println("到達finally...");
        }

        System.out.println("done!");

    }
}
