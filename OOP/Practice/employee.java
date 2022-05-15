package Practice;

import java.util.Scanner;

public abstract class employee extends person {

    private String jobtitle;
    private float salary;

    public employee(){
        super();
        jobtitle = null;
        salary = 0.0f;
    }

    public employee(String n, int a, String jt, float s){
        super(n, a);
        jobtitle = jt;
        salary = s;
    }

    public employee(employee e1){
        super(e1);
        this.jobtitle = e1.jobtitle;
        this.salary = e1.salary;
    }
    
    public void readData(){
        Scanner input = new Scanner(System.in);
        super.readData();
        System.out.print("Enter the job title: ");
        jobtitle = input.nextLine();
        System.out.print("Enter the salary: ");
        salary = input.nextFloat();
    }

    public boolean equals(employee e){
        if(super.equals(e) && this.jobtitle.equals(e.jobtitle) && this.salary == e.salary){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return("\n"+super.toString() + "\tJob title: "+jobtitle+"\tSalary: "+salary);
    }
}
