package lesson14;

import javax.swing.*;
import java.awt.*;

class App extends JFrame {
    private int width = 100;
    private int height = 300;

    App() {

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.width);
        System.out.println(screenSize.height);

        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;

        setBounds(x, y, width, height);
        setTitle("第一個APP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();

        setVisible(true);
    }

    void init() {
        JPanel panel = new JPanel();

        panel.setBounds(new Rectangle(0, 0, width, height));
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        setContentPane(panel);

        // 流程布局
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("按鈕1");
        panel.add(button1);

        JButton button2 = new JButton("按鈕2");
        panel.add(button2);

        JButton button3 = new JButton("按鈕3");
        panel.add(button3);

        JButton button4 = new JButton("按鈕4");
        panel.add(button4);

        JButton button5 = new JButton("按鈕5");
        panel.add(button5);
    }

}

public class Ch14_1 {
    public static void main(String[] args) {
        new App();
    }
}
