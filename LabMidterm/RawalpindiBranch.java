package LabMidterm;
import java.util.Scanner;


public class RawalpindiBranch extends Enchanted {

    public RawalpindiBranch(){
        super();
        super.branch = "Rawalpindi";
    }

    public void placeOrder(){
        Scanner input = new Scanner(System.in);
            System.out.print("\nHow many cups do you want to order: (Max 3): ");
            int j = input.nextInt();
            while(j>3 || j<=0){
              System.out.print("Wrong input. You can only only order between 1 and 3 cups. Enter again: ");
              j = input.nextInt();
            }
            int k = 0;
            String flavors_ordered[] = new String[3];
            while(k<j){ 
              System.out.print("Enter the flavor you want to order: "+this.flavors[0]+", "+this.flavors[1]+", "+this.flavors[2]+": ");
              String l = input.next();
              while(!l.equalsIgnoreCase("mango") && !l.equalsIgnoreCase("strawberry") && !l.equalsIgnoreCase("vanilla") ){
                System.out.print("Wrong input. Enter a correct flavor: ");
                l = input.next();
            }
                flavors_ordered[k] = " "+l;
                k++;
                Enchanted.totalOrders++;
              }
        
        System.out.print("\nDine-in is not available. TakeAway only!");
        this.takeaway = true;
        this.dineIn = false;
        System.out.print("\n    Receipt    \n");    
        System.out.print("\nOrder placed for: \n");
        int l=0;
        while(l<j){
            System.out.print((l+1)+"."+flavors_ordered[l]+"  ");
            l++;
        }
        
        System.out.print("\nBranch: "+this.branch+"\n");
        System.out.print("Service type: TakeAway");
        System.out.print("\nDate/Time: "+this.date+"\n");
      
    }
   
}
