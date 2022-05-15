package Assignment2;

public class TestPackage {
    public static void main(String[] args) {

        Object o1 = new TwoDaysPackage("Akbar","Gujrat","Abdullah","Karachi",25.5f,200,1000);
        Object o2 = new OverNightPackage("Aleem","Quetta","Behroz","Peshawar",20.0f,200,1500);

        if(o1 instanceof TwoDaysPackage){
            System.out.println(((TwoDaysPackage)o1).calculateCost());
        }
        if(o2 instanceof OverNightPackage){
            System.out.println(((OverNightPackage)o2).calculateCost());
        }
            }
        
        
    }
        
































    