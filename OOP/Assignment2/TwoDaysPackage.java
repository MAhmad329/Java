package Assignment2;

public class TwoDaysPackage extends Package {
    private float flatfee;

    public TwoDaysPackage(){
        super();
        flatfee = 0.0f;
    }

    public TwoDaysPackage(String sn, String sa, String rn, String ra, float w, float cpkg, float ff){
        super(sn, sa, rn, ra, w, cpkg);
        flatfee = ff;
    }

    public double calculateCost(){

        return (super.calculateCost()+flatfee);
    }
    
}






































