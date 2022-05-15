package Practice;
import java.util.Scanner;
public class testvehicle {
    public static void main(String[]args){
        vehicle v[] = new vehicle[3];

        for(int i=0;i<v.length;i++){
            v[i] = new vehicle();
            v[i].readData();
        }
        String s = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the manufacturer name to search: ");
        s = input.nextLine();

        vehicle v1 = vehicle.search(s,v);
        if(v1 != null){
            v1.showData();
        }

    }
    
}
