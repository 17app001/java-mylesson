package practise.ch11;

public class Ch11_ex1 {
    public static void main(String[] args) {
        try {
            new Server().connect("192.168.1.1", 80);
        } catch (ServerTimeoutException ex) {
            System.out.println(ex);
        }
    }
}
