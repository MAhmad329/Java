package Practice;
import java.util.Scanner;

public class vehicle{

    private String model;
    private String make;
    private String manufacturer;
    private float enginepower;
    private float fuelcapacity;

    public vehicle(){
        model = null;
        make = null;
        manufacturer = null;
        enginepower = 0.0f;
        fuelcapacity = 0.0f;
    }

    public vehicle(String ml,String mk, String mf, float ep, float fc){
        this.model = ml;
        this.make = mk;
        this.manufacturer = mf;
        this.enginepower = ep;
        this.fuelcapacity = fc;
    }

    public void readData(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter car model: ");
        model = input.nextLine();
        System.out.print("Enter car make: ");
        make = input.nextLine();
        System.out.print("Enter car manufacturer: ");
        manufacturer = input.nextLine();
        System.out.print("Enter engine power: ");
        enginepower = input.nextFloat();
        System.out.print("Enter fuel capacity: ");
        fuelcapacity = input.nextFloat();
    }
    
    public void showData(){
        System.out.print("\t\tVehicle Details: ");
        System.out.print("\tModel: "+model);
        System.out.print("\tMake: "+make);
        System.out.print("\tManfacturer: "+manufacturer);
        System.out.print("\tEngine Power: "+enginepower);
        System.out.print("\tFuel Capacity: "+fuelcapacity);
    }

    public static vehicle search(String s, vehicle v[]){
        int index = -1;

        for(int i=0;i<v.length;i++){
            if(v[i].manufacturer.equalsIgnoreCase(s)){
                index = i;
            }
        }
        if(index == -1){
            System.out.print("Vehicle not found!");
            return null;
        }
        else{
            return v[index];
        }

    }
    
}
