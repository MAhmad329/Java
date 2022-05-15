package Practice;
import java.util.Scanner;
public class testUniversity {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        University u1 = new University();
        u1.readData();
        u1.showData();

        String [] d = new String[20];
         for (int i=0;i<5;i++){
             System.out.print("\nEnter departments "+(i+1)+ " for second object: \n");
             d[i] = input.next();
         }

        University u2 = new University("Comsats", "Tehseen", "Tarlai Kalan", d );
        u2.showData();
        University u3 = new University(u1);
        u3.showData();
        University u4 = u2.compare(u1);
        System.out.print("\nMethod with higher department number is \n");
        u4.showData();

    }
    
}
