package LabMidterm;
import java.util.Scanner;
public class TestEnchanted {
    public static void main(String[]args){

      IslamabadBranch i1 = new IslamabadBranch();
      RawalpindiBranch r1 = new RawalpindiBranch();
      RawalpindiBranch r2 = new RawalpindiBranch();
      ComsatsBranch c1 = new ComsatsBranch();
      ComsatsBranch c2 = new ComsatsBranch();
      ComsatsBranch c3 = new ComsatsBranch();
      
      System.out.print("                    WELCOME TO ENCHANTED ICECREAM PARLOR");
      int i; 
      do{
        Scanner input  = new Scanner(System.in);
        System.out.print("\nEnter 1 to place an order\nEnter 2 to view total orders\nEnter 0 to exit: ");
        i = input.nextInt();

        switch(i){
          case 0:
            System.out.print("Program Exit");
            return;
          case 1:
          int j;
          System.out.print("In which branch branch do you want to place an order: Enter 1 for Islamabad, Enter 2 for Rawalpindi , Enter 3 for Comsats: ");
          j = input.nextInt();
          if(j == 1){
            i1.placeOrder(); 
            }
          else if(j == 2){
            r1.placeOrder();
            r2.placeOrder();
          }
          else if(j == 3){
            c1.placeOrder();
            c2.placeOrder();
            c3.placeOrder();
          }
          else{
            System.out.print("Wrong Selection!");
          }
          break;
          case 2:
            System.out.print(Enchanted.totalOrders);
            break;
          default:
            System.out.print("Wrong selection!");
            break;
          }
        }
        while(i!=0);
      }
    }

  


        
      
    
   
    
  
