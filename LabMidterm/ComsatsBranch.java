package LabMidterm;
import java.util.Scanner;


public class ComsatsBranch extends IslamabadBranch {

    public ComsatsBranch(){
        super();
        super.branch = "Comsats";

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
              System.out.print("All flavors are unique with a mix of chocolate! ");
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
        System.out.print("\n    Receipt    \n");    
        System.out.print("\nOrder placed for: \n");
        int l=0;
        while(l<j){
            System.out.print((l+1)+"."+flavors_ordered[l]+" ChocoMix  ");
            l++;
        }
        
        System.out.print("\nBranch: "+this.branch);
        if(this.dineIn == false){
            System.out.print("\nService type: Take-Away");
        }
        else{
            System.out.print("\nService type: Dine-In");
        }
        System.out.print("\nDate/Time: "+this.date+"\n");

        
        
    }


    
}
