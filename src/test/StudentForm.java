package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame implements ActionListener {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    private JTextField nameText;
    private JTextField chineseText;
    private JTextField mathText;
    private JTextField englishText;
    private JButton addBtn;
    private JButton saveBtn;

    private JTextArea outputArea;

    private Font font1;
    private Font font2;

    StudentForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, WIDTH, HEIGHT));
        setTitle("學生成績輸入系統");
        setLayout(null);

        font1 = new Font(Font.MONOSPACED, Font.PLAIN, 20);
        font2 = new Font(Font.SANS_SERIF, Font.PLAIN, 24);
        initRightPanel();
        initLeftPanel();

        setVisible(true);
    }

    void initRightPanel() {

        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setBounds(new java.awt.Rectangle(10, 10, (int) (WIDTH * 0.4), HEIGHT - 50));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "輸入"));

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(panel);

        // 增加輸入框
        panel.add(new JLabel("姓名"));
        nameText = getTextField("請輸入姓名", 14, font1);
        panel.add(nameText);

        panel.add(new JLabel("國文"));
        chineseText = getTextField("請輸入國文", 14, font1);
        panel.add(chineseText);

        panel.add(new JLabel("英文"));
        englishText = getTextField("請輸入英文", 14, font1);
        panel.add(englishText);

        panel.add(new JLabel("數學"));
        mathText = getTextField("請輸入數學", 14, font1);
        panel.add(mathText);

        addBtn = new JButton("新增");
        addBtn.setFont(font1);
        addBtn.addActionListener(this);
        panel.add(addBtn);

    }

    void initLeftPanel() {
        JPanel panel = new JPanel();
        panel.setBounds(new java.awt.Rectangle(
                10 + (int) (WIDTH * 0.4), 10, (int) (WIDTH * 0.55), HEIGHT - 100));
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "資料"));
        add(panel);

        outputArea = new JTextArea();
        outputArea.setBounds(new java.awt.Rectangle(
                20, 20, (int) (WIDTH * 0.50), HEIGHT - 130));
        outputArea.setFont(font2);

        panel.add(outputArea);

        saveBtn = new JButton("儲存");
        saveBtn.setBounds((WIDTH - 100) / 2 + 100, HEIGHT - 90, 100, 50);
        saveBtn.setFont(font1);
        saveBtn.addActionListener(this);
        this.add(saveBtn);

    }

    JTextField getTextField(String tipText, int columns, Font font) {
        JTextField field = new JTextField();
        field.setColumns(columns);
        field.setFont(font);
        field.setToolTipText(tipText);

        return field;
    }

    public static void main(String[] args) {

        new StudentForm();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            // JTextField[] fields = { nameText, chineseText, mathText, englishText };
            // boolean add = true;

            // StringBuilder sb = new StringBuilder();

        }

        if (e.getSource() == saveBtn) {
            System.out.println("save!");
        }

    }

}
