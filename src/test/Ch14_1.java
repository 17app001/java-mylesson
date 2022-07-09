package test;

import java.awt.*;
import javax.swing.*;

class App extends JFrame {
    private JPanel panel;

    App() {
        this.setVisible(true);
        this.setBounds(new Rectangle(100, 200, 400, 300));
        this.setTitle("第一個APP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        this.setContentPane(panel);
        // 使用
        this.setLayout(new FlowLayout());

        JButton btn1 = new JButton("按鈕1");
        JButton btn2 = new JButton("按鈕2");
        JButton btn3 = new JButton("按鈕3");
        JButton btn4 = new JButton("按鈕4");
        JButton btn5 = new JButton("按鈕5");

        panel.add(btn1, BorderLayout.NORTH);
        panel.add(btn2, BorderLayout.SOUTH);
        panel.add(btn3, BorderLayout.EAST);
        panel.add(btn4, BorderLayout.WEST);
        panel.add(btn5, BorderLayout.CENTER);

    }
}

public abstract class Ch14_1 {
    public static void main(String[] args) {
        new App();

    }
}
