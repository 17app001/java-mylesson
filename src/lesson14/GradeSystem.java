package lesson14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class StudentForm extends JFrame implements ActionListener {
    // private JTextField nameText;
    // private JTextField chineseText;
    // private JTextField mathText;
    // private JTextField englishText;
    // private JButton addBtn;
    // private JTextArea outputAtea;
    // private JButton saveBtn;

    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    StudentForm() {
        // 畫面置中
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.width);
        System.out.println(screenSize.height);

        int x = (screenSize.width - WIDTH) / 2;
        int y = (screenSize.height - HEIGHT) / 2;

        setBounds(x, y, WIDTH, HEIGHT);
        setTitle("學生成績輸入系統");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFrame布局樣式
        setLayout(null);
        // 左邊樣式布局
        initLeftPanel();
        // 顯示
        setVisible(true);
    }

    void initLeftPanel() {
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, (int) (WIDTH * 0.4), HEIGHT - 60);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.black),
                "輸入"));

        add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

public class GradeSystem {
    public static void main(String[] args) {
        new StudentForm();
    }

}
