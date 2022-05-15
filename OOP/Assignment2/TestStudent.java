package Assignment2;

import java.io.*;
import java.io.FileOutputStream;


public class TestStudent {
    public static void main(String[] args) {
       
        try{
            Student s1 = new Student();
            Student s2 = new Student();
            Student s3 = new Student();
            Student s4 = new Student();
            Student s5 = new Student();

            s1.readData();
            s2.readData();
            s3.readData();
            s4.readData();
            s5.readData();

            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Student.dat"));

            output.writeObject(s1);
            output.writeObject(s2);
            output.writeObject(s3);
            output.writeObject(s4);
            output.writeObject(s5);
            
            output.close();

            Student s = new Student();
            
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.dat"));
                float highestCGPA = 0.0f;
                while (true) {
                    Student hcgpa = (Student)in.readObject();
                    if (hcgpa.cgpa > highestCGPA) {
                        highestCGPA = hcgpa.cgpa;
                        s = hcgpa;
                    }
                }
                
        }
        
            catch(EOFException ef){
                System.out.print("End of File");
            
        }
        
        System.out.println(s.toString());
        
    }
        catch(Exception e){
            System.out.print("Exception Caught!");
            System.out.print(e.toString());
        }
    }

}

    

