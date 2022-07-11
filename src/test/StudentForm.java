package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentForm extends JFrame implements ActionListener {
    private final int WIDTH = 600;
    private final int HEIGHT = 500;

    private JTextField nameText;
    private JTextField chineseText;
    private JTextField mathText;
    private JTextField englishText;
    private JButton addBtn;
    private JButton saveBtn;
    private JButton loadBtn;
    private JCheckBox appendCbx;
    private JTextArea outputArea;

    private Font font1;
    private Font font2;
    private String fileName = "resource/txt/new_student.csv";

    public static void main(String[] args) {
        new StudentForm();
    }

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

    private void initRightPanel() {

        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setBounds(new java.awt.Rectangle(10, 10, (int) (WIDTH * 0.4), HEIGHT - 50));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "輸入"));

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

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

    private void initLeftPanel() {
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

        JScrollPane scrollPane = new JScrollPane(outputArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(new java.awt.Rectangle(
                20, 20, (int) (WIDTH * 0.50), HEIGHT - 130));

        panel.add(scrollPane);

        panel = new JPanel();
        panel.setBounds(new java.awt.Rectangle(
                10 + (int) (WIDTH * 0.4), HEIGHT - 90, (int) (WIDTH * 0.55), 120));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        appendCbx = new JCheckBox("覆寫");
        appendCbx.setFont(font1);
        appendCbx.setSelected(true);
        // appendCbx.setBounds(300, HEIGHT - 90, 50, 50);
        panel.add(appendCbx);

        saveBtn = new JButton("儲存");
        // saveBtn.setBounds((WIDTH - 100) / 2 + 100, HEIGHT - 90, 100, 50);
        saveBtn.setFont(font1);
        saveBtn.addActionListener(this);
        panel.add(saveBtn);

        loadBtn = new JButton("讀取");
        loadBtn.setFont(font1);
        loadBtn.addActionListener(this);
        panel.add(loadBtn);

        panel.add(loadBtn);

        add(panel);
    }

    private JTextField getTextField(String tipText, int columns, Font font) {
        JTextField field = new JTextField();
        field.setColumns(columns);
        field.setFont(font);
        field.setToolTipText(tipText);

        return field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            JTextField[] fields = { nameText, chineseText, mathText, englishText };
            boolean add = true;
            for (JTextField field : fields) {
                if (field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "資料輸入有誤!");
                    add = false;
                    break;
                }
            }

            if (add) {
                // 檢查是否是數字
                for (int i = 1; i < fields.length; i++) {
                    if (!tools.Tool.isNumber(fields[i].getText())) {
                        JOptionPane.showMessageDialog(null, "分數輸入有誤!");
                        add = false;
                        break;
                    }
                }
            }

            if (add) {
                StringBuilder sb = new StringBuilder();
                for (JTextField field : fields) {
                    sb.append(field.getText()).append(",");
                }

                sb.setLength(sb.length() - 1);
                sb.append("\n");
                outputArea.setText(outputArea.getText() + sb.toString());
            }
            return;
        }

        if (e.getSource() == saveBtn) {
            // if (fileName == null) {
            // JOptionPane.showMessageDialog(null, "請先開啟檔案!");

            // return;
            // }
            String text = outputArea.getText();
            if (text.equals("")) {
                JOptionPane.showMessageDialog(null, "目前無資料!");
                return;
            }

            saveToFile(fileName, text,
                    appendCbx.isSelected() ? false : true);

            return;
        }

        if (e.getSource() == loadBtn) {
            FileDialog fd = new FileDialog(this, "Choose a file", FileDialog.LOAD);
            fd.setDirectory("/");
            fd.setFile("*.csv");
            fd.setVisible(true);
            String filename = fd.getFile();
            if (filename == null) {
                System.out.println("You cancelled the choice");
            } else {
                fileName = fd.getDirectory() + fd.getFile();
                loadFromFile(fileName);
            }

            return;
        }

    }

    private void loadFromFile(String filename) {

        File file = new File(filename);

        FileReader fileReader = null;
        BufferedReader in = null;

        if (file.exists()) {
            try {
                fileReader = new FileReader(filename);
                in = new BufferedReader(fileReader);
                String str;
                outputArea.setText("");
                while ((str = in.readLine()) != null) {
                    outputArea.append(str + "\n");
                }

                // char[] buffer = new char[(int) file.length()];
                // fileReader.read(buffer);

                // String str = new String(buffer);
                // outputArea.set(str);

                JOptionPane.showMessageDialog(null, "檔案讀取成功!");
                this.setTitle("學生成績輸入系統 " + fileName);

            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                if (fileReader != null) {
                    try {
                        in.close();
                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }

        }

    }

    private void saveToFile(String filename, String text, boolean append) {
        FileWriter fileWriter = null;
        File file = new File(filename);
        boolean writeheader = false;

        if (!file.exists() || !append) {
            writeheader = true;
        }

        // BufferedWriter out = null;
        try {
            // out = new BufferedWriter(
            // new OutputStreamWriter(new FileOutputStream(file, append),
            // StandardCharsets.UTF_8));

            fileWriter = new FileWriter(filename, append);
            if (writeheader) {
                // out.write('\ufeff');
                fileWriter.write("姓名,國文,英文,數學\n");
            }
            // 寫入資料
            // out.write(text);
            fileWriter.write(text);
            JOptionPane.showMessageDialog(null, "資料寫入成功!");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                    // out.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

}
