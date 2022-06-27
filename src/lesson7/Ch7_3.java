package lesson7;

/**
 * 字串常用方法
 * concat/equals/repalce/substring/trim
 */
public class Ch7_3 {
    public static void main(String[] args) {
        String email = "Mario@gmail.com";
        String tel = "096767676";
        System.out.println(email.indexOf("M"));
        System.out.println(email.indexOf("O"));
        System.out.println(email.indexOf("o"));
        System.out.println(email.lastIndexOf("o"));

        String info = email + tel;
        System.out.println(info);
        info = email.concat(tel);
        System.out.println(info);

        System.out.println("y".equals("Y"));
        System.out.println("y".equalsIgnoreCase("Y"));

        System.out.println(email.replace("Mario", "Jerry"));
        email = email.replace("Mario", "Jerry");

        System.out.println(email);

        System.out.println(email.substring(6));

        String name = email.substring(0, 5);

        System.out.println(name);

        String str1 = "\n Mario@gmail.com  \n";
        System.out.println(str1);
        System.out.println(str1.trim());

        String result = str1.replace("\n", " ").trim();
        System.out.println(result);
        System.out.println("============================================");
        System.out.print(str1.replace('\n', ' ').trim());

    }
}
