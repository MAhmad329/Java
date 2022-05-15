package GUI;

import javax.swing.JFrame;

public class testGUI {
    public static void main(String[] args) {
        GUI frame = new GUI();
        frame.setTitle("Ahmad's GUI");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

