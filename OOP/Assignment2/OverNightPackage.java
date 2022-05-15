package Assignment2;

public class OverNightPackage extends Package {
    private float additional_fee;

    public OverNightPackage(){
        super();
        additional_fee = 0.0f;
    }

    public OverNightPackage(String sn, String sa, String rn, String ra, float w, float cpkg, float af){
        super(sn, sa, rn, ra, w, cpkg);
        additional_fee = af;
    }

    public double calculateCost(){

        return (super.calculateCost()+additional_fee);
    }
    
}



























