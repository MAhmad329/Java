package Practice;
public class TestTime {
    public static void main(String[]args){

        Time t1 = new Time();
        Time t2 = new Time(7,12,59);
        Time t3 = new Time(t1);

        t1.setHour(12);
        t1.setMin(5);
        t1.setSec(59);

       

      /*t1.showData();
        System.out.print("Hours: "+t2.getHour());
        System.out.print("Minutes: "+t2.getMin());
        System.out.print("Seconds: "+t2.getSec());*/
        Time t4 = t2.timesum(t3);
        System.out.print("Hour: "+t4.getHour()+"\tMin: "+t4.getMin()+"\tSec: "+t4.getSec()+"\n");
        Time.showCount();
    }

}
