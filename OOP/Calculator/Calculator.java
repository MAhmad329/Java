import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame {
    private JTextField tf1;
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    private JButton btn_0;
    private JButton btnPlus;
    private JButton btnminus;
    private JButton btnmultiply;
    private JButton btndivide;
    private JButton btnEqual;
    private JButton btnClear;
    private float leftOp;
    private float rightOp;
    private char operation;
    private Float result;
    public Calculator() {
        setLayout(new GridLayout(2, 1, 10, 10));
        JPanel panel1 = new JPanel(new GridLayout(1, 1, 0, 0));
        JPanel panel2 = new JPanel(new GridLayout(4, 2, 5, 5));
        tf1 = new JTextField(8);
        btn_1 = new JButton("1");
        btn_1.addActionListener(new MyHandler());
        btn_2 = new JButton("2");
        btn_2.addActionListener(new MyHandler());
        btn_3 = new JButton("3");
        btn_3.addActionListener(new MyHandler());
        btn_4 = new JButton("4");
        btn_4.addActionListener(new MyHandler());
        btn_5 = new JButton("5");
        btn_5.addActionListener(new MyHandler());
        btn_6 = new JButton("6");
        btn_6.addActionListener(new MyHandler());
        btn_7 = new JButton("7");
        btn_7.addActionListener(new MyHandler());
        btn_8 = new JButton("8");
        btn_8.addActionListener(new MyHandler());
        btn_9 = new JButton("9");
        btn_9.addActionListener(new MyHandler());
        btn_0 = new JButton("0");
        btn_0.addActionListener(new MyHandler());
        btnPlus = new JButton("+");
        btnPlus.addActionListener(new MyHandler());
        btnminus = new JButton("-");
        btnminus.addActionListener(new MyHandler());
        btnmultiply = new JButton("*");
        btnmultiply.addActionListener(new MyHandler());
        btndivide = new JButton("/");
        btndivide.addActionListener(new MyHandler());
        btnEqual = new JButton("=");
        btnEqual.addActionListener(new MyHandler());
        btnClear = new JButton("C");
        btnClear.addActionListener(new MyHandler());
        panel1.add(tf1);
        add(panel1);
        panel2.add(btn_1);
        panel2.add(btn_2);
        panel2.add(btn_3);
        panel2.add(btn_4);
        panel2.add(btn_5);
        panel2.add(btn_6);
        panel2.add(btn_7);
        panel2.add(btn_8);
        panel2.add(btn_9);
        panel2.add(btn_0);
        panel2.add(btnPlus);
        panel2.add(btnminus);
        panel2.add(btnmultiply);
        panel2.add(btndivide);
        panel2.add(btnEqual);
        panel2.add(btnClear);
        add(panel2);
    }
    // inner class
    class MyHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_1) {
                tf1.setText(tf1.getText() + "1");
            }
            if (e.getSource() == btn_2) {
                tf1.setText(tf1.getText() + "2");
            }
            if (e.getSource() == btn_3) {
                tf1.setText(tf1.getText() + "3");
            }
            if (e.getSource() == btn_4) {
                tf1.setText(tf1.getText() + "4");
            }
            if (e.getSource() == btn_5) {
                tf1.setText(tf1.getText() + "5");
            }
            if (e.getSource() == btn_6) {
                tf1.setText(tf1.getText() + "6");
            }
            if (e.getSource() == btn_7) {
                tf1.setText(tf1.getText() + "7");
            }
            if (e.getSource() == btn_8) {
                tf1.setText(tf1.getText() + "8");
            }
            if (e.getSource() == btn_9) {
                tf1.setText(tf1.getText() + "9");
            }
            if (e.getSource() == btn_0) {
                tf1.setText(tf1.getText() + "0");
            }
            if (e.getSource() == btnPlus) {
                leftOp = Float.parseFloat(tf1.getText());
                operation = '+';
                tf1.setText("");
            }
            if (e.getSource() == btnminus) {
                leftOp = Float.parseFloat(tf1.getText());
                operation = '-';
                tf1.setText("");
            }
            if (e.getSource() == btnmultiply) {
                leftOp = Float.parseFloat(tf1.getText());
                operation = '*';
                tf1.setText("");
            }
            if (e.getSource() == btndivide) {
                leftOp = Float.parseFloat(tf1.getText());
                operation = '/';
                tf1.setText("");
            }
            if (e.getSource() == btnEqual) {
                rightOp = Float.parseFloat(tf1.getText());
                if (operation == '+') {
                    result = leftOp + rightOp;
                    tf1.setText(result.toString());
                }
                if (operation == '-') {
                    result = leftOp - rightOp;
                    tf1.setText(result.toString());
                }
                if (operation == '*') {
                    result = leftOp * rightOp;
                    tf1.setText(result.toString());
                }
                if (operation == '/') {
                    result = leftOp / rightOp;
                    tf1.setText(result.toString());
                }
            }
            if (e.getSource() == btnClear) {
                tf1.setText("");
            }
        }
    }
}
