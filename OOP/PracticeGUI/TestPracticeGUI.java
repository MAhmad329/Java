package PracticeGUI;

import javax.swing.JFrame;


public class TestPracticeGUI {
    public static void main(String[] args) {
        PracticeGUI frame = new PracticeGUI();
        frame.setTitle("Ahmad's GUI");
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}