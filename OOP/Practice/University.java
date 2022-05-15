package Practice;
import java.util.Scanner;
public class University {
    String uniName;
    String rectorName;
    String location;
    String[]departments = new String[20];

    public University(){
        uniName = null;
        rectorName = null;
        location = null;
        for(int i=0;i<departments.length;i++){
            departments[i] = null;
        }
        
    }

    public University(String u, String r, String l, String[]d){
        this.uniName = u;
        this.rectorName = r;
        this.location = l;
        this.departments = d;

    }

    public University(University u1){
        this.uniName = u1.uniName;
        this.rectorName = u1.rectorName;
        this.location = u1.location;
        this.departments = u1.departments;
    }
    
    public void setuniName(String u){
        uniName = u;
    }

    public void setrectorName(String r){
        rectorName = r;
    }

    public void location(String l){
        location = l;
    }

    public String getuniName(){
        return uniName;
    }

    public String getrectorName(){
        return rectorName;
    }

    public String getlocation(){
        return location;
    }

    public void readData(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the name of University: ");
        uniName = input.nextLine();

        System.out.println("Enter the name of Rector: ");
        rectorName = input.nextLine();

        System.out.println("Enter the location: ");
        location = input.nextLine();

        System.out.println("\nDepartments\n");
        for(int i = 0;i<departments.length;i++){
            System.out.println("Enter the name of Department "+(i+1)+" or \nEnter '/' to exit: ");
            String n = input.next();
            if (n.equals("/")){
                break;
            }
            else {
                departments[i] = n;
            }
        }

        }

        public void showData(){
            
            System.out.println("\nThe details of the object are: \n");
            System.out.println("\nUniversity Name: "+uniName+"\n");
            System.out.println("\nRector Name: "+rectorName+"\n");
            System.out.println("\nLocation: "+location+"\n");

            for(int i = 0;i<departments.length;i++){
                if (departments[i]!=null){
                    System.out.println("\nDepartment "+(i+1)+": "+departments[i]+"\n");

                }
                
        }


    }  
        
        public University compare(University temp){
            

            int count1 = 0;
            int count2 = 0;
            
            for (int i = 0; this.departments[i]!=null;i++){
                count1++;
            
                
            }
            for (int i = 0; temp.departments[i]!=null;i++){
                count2++;
            }
            if (count1>count2){
                return this;
            }
            else{
                return temp;
            }
             
            

        }

    }


