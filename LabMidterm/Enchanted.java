package LabMidterm;
import java.util.Date;
import java.util.Scanner;

public class Enchanted {

    protected String[] flavors = new String[3];
    protected String branch;
    protected Date date;
    protected boolean dineIn;
    protected boolean takeaway;
    protected static int totalOrders;
    
    public Enchanted(){
        flavors[0] = "Mango";
        flavors[1] = "Strawberry";
        flavors[2] = "Vanilla";
        branch = null;
        dineIn = false;
        takeaway = false;
        date = new Date();
        
    }

    public void placeOrder(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nPress 1 for dine in, Press 2 for takeaway: ");
            int i = input.nextInt();
            while(i>2 || i<=0){
              System.out.print("Wrong input. Enter again: ");
              i = input.nextInt();
            }
            if(i == 1){
              this.dineIn = true;
              this.takeaway = false;
            }
            else if(i == 2){
              this.dineIn = false;
              this.takeaway = true;
            }
            System.out.print("How many cups do you want to order: (Max 3): ");
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
             
        System.out.print("\nOrder placed for: \n");
        int l=0;
        while(l<j){
            System.out.print((l+1)+"."+flavors_ordered[l]+"  ");
            l++;
        }
        
        System.out.print("\nBranch: "+this.branch+"\n");
        if(this.dineIn == false){
            System.out.print("Service type: Take-Away");
        }
        else{
            System.out.print("Service type: Dine-In");
        }
        System.out.print("\nDate/Time: "+this.date+"\n");

        
        
    }
}

    
