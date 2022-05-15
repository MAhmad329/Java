package Practice;
import javax.swing.*;
public class tester {
    public static void main(String[] args) {
        MyGUI frame =new MyGUI();
        frame.setTitle("My FIRST GUI");
        frame.setVisible(true);
//      frame.setLocationRelativeTo(null);
      frame.setLocation(600,250);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

}
