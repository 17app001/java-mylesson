package lesson2;

/**
 * 字元測試
 */
public class Ch2_3 {
    // psvm
    public static void main(String[] args) {
        char a = 'A'; // 65
        char b = 66;
        // ascii
        char c = 97; // 'a'
        char d = '\n'; // 換行
        System.out.println(a);
        System.out.print(b);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + c);
        System.out.println((int) a); // 'A'==>65
        System.out.println(65 == a);

        boolean x = true;
        boolean y = false;

        System.out.println(x + "," + y);

        int x1 = 10;
        int y1 = 20;

        System.out.println(x1 == y1);

        System.out.println("===========================");

        System.out.println();
        // \n =>換行 \t =>tab \" \\

        System.out.print("ABC\nDEF\nGHI\n");
        System.out.println("end.");
        System.out.println("1234\tdef\tghi");
        // Jerry "come" to Mary
        System.out.println("Jerry \\come\\ to Mary");
        System.out.println("C:\\Program Files\\Java\\jdk-18.0.1.1\\bin");

        System.out.println("===========================");

        System.out.println(65);
        System.out.println((int) 'A');
        System.out.println('\u0041');
        System.out.println('\101');

        System.out.println(10);
        System.out.println(0b1010);
        System.out.println(0x000a);
        System.out.println(0012);
    }
}
