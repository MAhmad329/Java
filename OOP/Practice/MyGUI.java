package Practice;
import javax.swing.*;//button, radioButtons etc
import java.awt.*;//set layout
//->FLOW LAYOUT MANAGER //SETS IN THE FLOW
//-> GRID LAYOUT MANAGER //SETS IN MATRIX FORM
//-> BORDER LAYOUT MANAGER //SETS EAST-WEST-NORTH-SOUTH-CENTRE SETTINGS



public class MyGUI extends JFrame //after extending the swing library becomes active
{
    public MyGUI(){
       setLayout(new FlowLayout(FlowLayout.LEFT,10,20));// This is FLOW LAYOUT
//        setLayout(new GridLayout(2,2,10,10));
       // setLayout(new BorderLayout(10,10));
        JLabel label1=new JLabel("GUI"); //buttons //Labels must be meaningful
        add(label1);
       // add(label1,BorderLayout.EAST);
       // JTextField tr1=new JTextField(10);


       // add(tr1);
       // add(label1,BorderLayout.EAST);

       // JLabel label2=new JLabel("Last Name");
      // add(label2);
        //add(label2,BorderLayout.WEST);
//        JLabel label3=new JLabel("Address");
        //add(label3,BorderLayout.WEST);

      // JTextField text2=new JTextField(10);
      // add(text2);
      //  JButton button1=new JButton("OK");
       // add(button1);
        JCheckBox c1=new JCheckBox("Happy");
        add(c1);


        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        add(rb1);
        add(rb2);
        ButtonGroup b = new ButtonGroup();




        String [] s1={"CS","FOG","MVC","EE","BIO"};
        JComboBox cb1=new JComboBox(s1);
        add(cb1);






    }



}
