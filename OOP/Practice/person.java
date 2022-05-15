package Practice;
import java.io.Serializable;
import java.util.Scanner;

public class person implements Serializable {
    private String name;
    private int age;
    protected static int count;

    public person(){
        name = null;
        age = 0;
        
        
    }

    public person(String n, int a){
        name = n;
        age = a;
    }

    public person(person p1){
        this.name = p1.name;
        this.age = p1.age;
    }

    public String toString(){
        return("Name: "+name+"\tAge: "+age);
        
    }
    
    public boolean equals(person p){
        if(this.name.equals(p.name) && this.age == p.age){
            return true;
        }
        else{
            return false;
        }
    }
    public void readData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = input.nextLine();
        System.out.print("Enter the age: ");
        age = input.nextInt();
        
    }
    
}
