package Practice;
import java.util.Scanner;

public class teacher extends employee {

    private int number_courses;
    private boolean enrolled_in_research;  

    public teacher(){
        super();
        number_courses = 0;
        enrolled_in_research = false;

    }

    public teacher(String n, int a, String jt, float s, int nc, boolean enroll){
        super(n,a,jt,s);
        number_courses = nc;
        enrolled_in_research = enroll;

    }

    public teacher(teacher t1){
        super(t1);
        this.number_courses = t1.number_courses;
        this.enrolled_in_research = t1.enrolled_in_research;   
    }

    public void readData(){
        Scanner input = new Scanner(System.in);
        super.readData();
        System.out.print("Enter the number of courses: ");
        number_courses = input.nextInt();


    }

    public String toString(){
        return("\n"+super.toString()+"\tNumber of courses: "+number_courses);
    }
}
