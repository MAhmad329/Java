package Assignment2;

public class Package {
    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;
    private float weight;
    private float costperKG;

    public Package(){
        senderName = null;
        senderAddress = null;
        receiverName = null;
        receiverAddress = null;
        weight = 0.0f;
        costperKG = 0.0f;
    } 
    public Package(String sn, String sa, String rn, String ra, float w, float cpkg){
        senderName = sn;
        senderAddress = sa;
        receiverName = rn;
        receiverAddress = ra;
        if((w>0 && cpkg>0)){
            weight = w;
            costperKG = cpkg;
        }
        else if(w<0 && cpkg>=0){
            weight = -w;
            costperKG = cpkg;
        }
        else if(w>=0 && cpkg<0){
            weight = w;
            costperKG = -cpkg;
        }
        else{
            weight = -w;
            costperKG = -cpkg;
        }
    }
    public double calculateCost() {
    
        return weight*costperKG;
    }   
}


