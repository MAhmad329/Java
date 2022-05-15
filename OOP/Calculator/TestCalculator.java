import javax.swing.*;
public class TestCalculator {
    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setTitle("Ahmad's Calculator");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
