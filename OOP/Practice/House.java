package Practice;
import java.util.*;
public class House implements Comparable<House>{
    private int house_no;
    private double area;
    private Date whenbuilt;

    public House(){
        house_no = 0;
        area = 0.0;
        whenbuilt = new Date();
    }

    public int get_houseno(){
        return house_no;
    }
    public double get_area(){
        return area;
    }
    public Date get_whenbuilt(){
        return whenbuilt;
    }

    public int compareTo(House h){
        if(this.area == h.area){
            return 0;
        }
        else if(this.area>h.area){
            return 1;
        }
        else{
            return -1;
        }
    }

    public void readData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter house no: ");
        house_no = input.nextInt();
        System.out.print("Enter area: ");
        area = input.nextDouble();
    }

    public String toString(){
        return "House No: "+house_no+"\t Area: "+area+"\t Date when built: "+whenbuilt;
    }

}
