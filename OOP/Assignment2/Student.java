package Assignment2;
import java.io.Serializable;
import java.util.Scanner;
public class Student implements Serializable { 
    protected String name;
    protected int id;
    protected float cgpa;
    
    public Student(){
        name = null;
        id = 0;
        cgpa = 0.0f;
    }

    public void readData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter id: ");
        id = input.nextInt();
        System.out.print("Enter cgpa: ");
        cgpa = input.nextFloat();
        
    }

    public String toString(){
        return "Name: "+name+"\tId: "+id+"\tCGPA: "+cgpa;
    }
}