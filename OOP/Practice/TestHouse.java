package Practice;
public class TestHouse {
    public static void main(String[]args){
        House h1 = new House();
        House h2 = new House();
        h1.readData();
        h2.readData();
        System.out.print("Object 1: \n"+h1.toString());
        System.out.print("\nObject 2: \n"+h2.toString());

        int e = h1.compareTo(h2);

        if(e == 0){
            System.out.println("\nBoth Houses are equal");
        }
        else if(e == 1){
            System.out.print("\nHouse: "+h1.get_houseno()+" is bigger than House "+h2.get_houseno());

        }
        else if(e==-1){
            System.out.print("\nHouse: "+h2.get_houseno()+" is bigger than House "+h1.get_houseno());
        }
    }
}
