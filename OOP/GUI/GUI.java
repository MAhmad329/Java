package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI extends JFrame {
    private JButton btn1;
    private JTextField tf1;
    private JCheckBox cb;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JComboBox combo;

    public GUI(){

        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JTextField tf1 = new JTextField(8);
        JButton btn1 = new JButton("1");
        add(btn1);
        add(tf1);

        cb=new JCheckBox("Happy");
        cb.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent e){if(e.getStateChange()==1){JOptionPane.showMessageDialog(null, "I am Happy!");}}} );
        add(cb);


        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        ButtonGroup b = new ButtonGroup();
        b.add(rb1);
        b.add(rb2);
        btn1.addActionListener(e->tf1.setText(tf1.getText()+ "1"));
        
        rb1.addActionListener(e->{AbstractButton ab = (AbstractButton)e.getSource();JOptionPane.showMessageDialog(null, ab.getText());});
       /* rb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AbstractButton ab =(AbstractButton)e.getSource();
                JOptionPane.showMessageDialog(null, ab.getText());
            }
        });
        */

        rb2.addActionListener(e->{AbstractButton ab = (AbstractButton)e.getSource();JOptionPane.showMessageDialog(null, ab.getText());});
      /*  rb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AbstractButton ab =(AbstractButton)e.getSource();
                JOptionPane.showMessageDialog(null, ab.getText());
            }
        });
        */
        add(rb1);
        add(rb2);
        String [] s1={"CS","FOG","MVC","EE","BIO"};

        combo=new JComboBox(s1);
        combo.addItemListener(e->{JOptionPane.showMessageDialog(null, (String)combo.getSelectedItem());});
        add(combo);
        
    }
//itemlistner and itemevent for checkboxes
      /*  class MyComboHandler implements ItemListener{
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()==1){
                JOptionPane.showMessageDialog(null, (String)combo.getSelectedItem());
                }
            }  
        }*/
    }

