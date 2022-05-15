package Practice;
public class testInheritance {
    public static void main(String[] args) {
        //Object o = new Object();
        Object o1 =  new Object();
        //person o2 = new employee();
        person o3 = new teacher();
        Object o4 = new teacher();
        //((person)o1).readData();

       // if(o2 instanceof employee){
       //     System.out.print("True");
       // }

        //System.out.print(o.toString());
        System.out.print(o1.toString());
        //System.out.print(o2.toString());
        System.out.print(o3.toString());

       

       // System.out.print(o.equals(o1));
        
    }

    public void showsdata(Object o){
            ((person)o).readData();
    }
    
}
