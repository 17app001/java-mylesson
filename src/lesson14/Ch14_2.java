package lesson14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.io.*;

class Login extends JFrame {
    private int width = 400;
    private int height = 400;

    private String accountData;

    Login() {

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.width);
        System.out.println(screenSize.height);

        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;

        setBounds(x, y, width, height);
        setTitle("登入介面DEMO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();

        setVisible(true);

        accountData = loadFile("resource/txt/account.txt");
        if (accountData != null) {
            System.out.println("遠端伺服器資料讀取成功!");
        } else {
            System.out.println("遠端伺服器資料讀取失敗!");
        }

    }

    void init() {
        JPanel panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);

        Font font1 = new Font(Font.SANS_SERIF, Font.PLAIN, 24);
        Font font2 = new Font(Font.MONOSPACED, Font.BOLD, 16);

        JLabel label1 = new JLabel("登入介面");
        label1.setFont(font1);
        label1.setBounds((width - 24 * 4) / 2, 10, 200, 30);
        panel.add(label1);

        JTextField userName = new JTextField();
        userName.setFont(font2);
        userName.setToolTipText("請輸入帳號");
        userName.setHorizontalAlignment(JTextField.CENTER);
        userName.setBounds((width - 200) / 2, 80, 200, 40);
        panel.add(userName);

        JPasswordField password = new JPasswordField();
        password.setFont(font2);
        password.setToolTipText("請輸入密碼");
        password.setHorizontalAlignment(JTextField.CENTER);
        password.setBounds((width - 200) / 2, 160, 200, 40);
        panel.add(password);

        JButton loginBtn = new JButton("登入");
        loginBtn.setFont(font2);
        loginBtn.setBounds((width - 100) / 2, height - 100, 100, 50);
        // 實作監聽功能
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = userName.getText();
                String pass = new String(password.getPassword());

                if (name.equals("") || pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "帳號跟密碼不能為空!");
                    return;
                }

                if (accountData == null) {
                    JOptionPane.showMessageDialog(null, "遠端伺服器資料讀取失敗!");
                    return;
                }

                if (checkAccount(name, pass)) {
                    JOptionPane.showMessageDialog(null, "登入成功！");
                } else {
                    JOptionPane.showMessageDialog(null, "登入失敗~~");
                }
            }

        });

        panel.add(loginBtn);
    }

    // 讀取檔案
    String loadFile(String path) {
        File file = new File(path);
        FileReader fileReader = null;

        if (file.exists()) {
            try {
                fileReader = new FileReader(path);
                char[] buffer = new char[(int) file.length()];
                fileReader.read(buffer);

                String str = new String(buffer);

                return str;

            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }
        }

        return null;
    }

    // 檢查帳號密碼的函式
    boolean checkAccount(String username, String password) {
        System.out.println(username + "," + password);
        String[] datas = accountData.split("\n");
        for (String data : datas) {
            String[] account = data.split(",");
            String name = account[0];
            String pass = account[1];
            System.out.println(name + "," + pass);

            if (username.equals(name) && password.equals(pass)) {
                return true;
            }

        }

        return false;
    }

}

public class Ch14_2 {
    public static void main(String[] args) {
        new Login();
    }

}
