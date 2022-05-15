package Practice;

public class student {
     private int id;
     private String name;
     private java.util.Date dateCreated;
     private Time t1;
    
     public student(int ssn, String newName,int h,int m,int s) {
     id = ssn;
     name = newName;
     dateCreated = new java.util.Date();
     t1 = new Time(h,m,s);
     }
    
     public int getId() {
     return id;
     }
    
     public String getName(){
       // student s1 = new student(id, name, id, id, id);
       // student s2 = (student) s1.clone();
     return name;
     }
    
     public void showData(){
        System.out.print(id+name);
        t1.showData();
     }

     public java.util.Date getDateCreated() {
     return dateCreated;
     }

    public void readData() {
    }
     }