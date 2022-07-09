package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private int width;
    private int height;

    Login(String title) {
        width = 600;
        height = 400;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setBounds(new Rectangle(400, 200, width, height));

        init();

        setVisible(true);

    }

    public void init() {
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        panel.setLayout(null);

        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 22);

        JTextField userName = new JTextField();
        userName.setColumns(10);
        userName.setFont(font);
        userName.setBounds(new Rectangle((width - 200) / 2, 100, 200, 40));
        panel.add(userName);

        JPasswordField password = new JPasswordField();
        password.setColumns(10);
        password.setFont(font);
        password.setBounds(new Rectangle((width - 200) / 2, 180, 200, 40));
        panel.add(password);

        JButton loginBtn = new JButton("登入");
        loginBtn.setBounds(new Rectangle((width - 100) / 2, height - 50 * 2, 100, 50));
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass = String.valueOf(password.getPassword());
                System.out.println(e.getSource());
                if (userName.getText().equals("Jerry") &&
                        pass.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "登入成功!");
                    System.out.println("登入成功!");
                } else {
                    System.out.println("登入失敗");
                }
            }
        });

        panel.add(loginBtn);

        JLabel label = new JLabel("登入介面");
        label.setFont(font);
        label.setBounds(new Rectangle((width - font.getSize() * 4) / 2, 20, font.getSize() * 4 + font.getSize() / 2,
                font.getSize() + font.getSize() / 2));
        panel.add(label);

    }

    public static void main(String[] args) {
        Login login = new Login("登入介面");

        login.init();
    }

}
