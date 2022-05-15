package PracticeGUI;
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class PracticeGUI extends JFrame {

    
    public PracticeGUI(){

        JFrame frame = new JFrame();

        //for top info
        JLabel label1 = new JLabel("Employee Information System");
        label1.setBounds(100, 10, 300, 20);
        
        //label for id field
        JLabel label2 = new JLabel();
        label2.setText("ID");
        label2.setBounds(40, 50, 300, 20);

        //label for name field
        JLabel label3 = new JLabel();
        label3.setText("Name");
        label3.setBounds(40, 90, 300, 20);

        //textfield for id
        JTextField tf1 = new JTextField(15);
        tf1.setBounds(110, 50, 150, 20);
        
        //textfield for name
        JTextField tf2 = new JTextField(15);
        tf2.setBounds(110, 90, 150, 20);

        //label for gender buttons
        JLabel label4 = new JLabel();
        label4.setText("Gender");
        label4.setBounds(40,150,300,20);

        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(110,150,70,20);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(200,150,70,20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        //label for designation
        JLabel label5 = new JLabel();
        label5.setText("Designation");
        label5.setBounds(40,200,100,20);

        //string array for dropdown menu for designation
        String[] s = {"Select" , "Manager" , "Junior Developer" , "Senior Developer"};

        //combobox for dropdown menu
        JComboBox cb1 = new JComboBox(s);
        cb1.setBounds(150,200,100,20);

        //label for salary field
        JLabel label6 = new JLabel();
        label6.setText("Salary");
        label6.setBounds(40,250,100,20);

        //textfield for salary
        JTextField tf3 = new JTextField(15);
        tf3.setBounds(120,250,150,20);

        //label for status
        JLabel label7 = new JLabel();
        label7.setText("Status");
        label7.setBounds(40,300,100,20);

        JRadioButton rb3 = new JRadioButton("Hourly");
        rb3.setBounds(100,300,70,20);

        JRadioButton rb4 = new JRadioButton("Monthly");
        rb4.setBounds(200,300,70,20);
        //grouping buttons hourly and monthly
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);

        //label for tax
        JLabel label8 = new JLabel();
        label8.setText("Tax");
        label8.setBounds(40,350,100,20);

        //textfield for tax

        JTextField tf4 = new JTextField();
        tf4.setBounds(120,350,150,20);

        JButton btn1 = new JButton("Save"); 
        btn1.setBounds(40,400,70,20);
        
        JButton btn2 = new JButton("Delete"); 
        btn2.setBounds(120,400,70,20);
        
        JButton btn3 = new JButton("Clear"); 
        btn3.setBounds(200,400,70,20);
        
        JButton btn4 = new JButton("CalTax"); 
        btn4.setBounds(280,400,90,20);

        JPanel panel1 = new JPanel(null);
        
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        panel1.add(label5);
        panel1.add(label6);
        panel1.add(label7);
        panel1.add(label8);
        panel1.add(tf1);
        panel1.add(tf2);
        panel1.add(tf3);
        panel1.add(tf4);
        panel1.add(rb1);
        panel1.add(rb2);
        panel1.add(rb3);
        panel1.add(rb4);
        panel1.add(cb1);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        add(panel1,BorderLayout.CENTER);

        






        







        


       
        
        


    }
    
}
