package Practice;
import java.util.Scanner;
public class Time {
    private static int count;
    private int hour;
    private int min;
    private int sec;

    public Time(){
        count++;
        hour = 0;
        min = 0;
        sec = 0;

    }

    public Time(int h,int m,int s){
        count++;
        hour = h;
        min = m;
        sec = s;
    }

    public Time(Time t){
        count++;
        this.hour = t.hour;
        this.min = t.min;
        this.sec = t.sec;
    }

    public static void showCount(){
        System.out.print("Count: "+count);
    }

    public void readData(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hour = input.nextInt();

        System.out.print("Enter minutes: ");
        min = input.nextInt();

        System.out.print("Enter seconds: ");
        sec = input.nextInt();

    }

    public void showData(){
        System.out.print("Hour: "+hour+"\tMin: "+min+"\tSeconds: "+sec);
    }

    public void setHour(int h){
        hour = h;
    }

    public void setMin(int m){
        min = m;
    }

    public void setSec(int s){
        sec = s;
    }

    public int getHour(){
        return hour;
    }

    public int getMin(){
        return min;
    }

    public int getSec(){
        return sec;
    }

    public Time timesum(Time t2){

        Time t = new Time();

        t.hour = this.hour+t2.hour;
        t.min = this.min+t2.min;
        t.sec = this.sec+t2.sec;

        if(t.min>=60){
            t.hour += t.min/60;
            t.min = t.min%60; 
        }

        if(t.sec>=60){
            t.min += t.sec/60;
            t.sec = t.sec%60;
        }

        return t;

        }
        

        

    }

    

