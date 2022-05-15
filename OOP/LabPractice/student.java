package LabPractice;

public class student extends person {
    private String rollNo ;
    private int marks ;
    public student() {
    super() ;
    rollNo = "sp14bcs039" ;
    marks = 345 ;
    }
    public student(String a , String b , String c , String d , int e){
    super(a,b,c) ;
    rollNo = d ;
    marks = e ;
    }
    public void setRollNo(String a){
    rollNo = a ;
    }
    public void setMarks(int a ){
    marks = a ;
    }
    public String getRollNo() {
        return rollNo;
        }
    public int getMarks() {
        return marks ;
        }
    public String toString( ) {
        return(super.toString()+"\tRoll # : " + rollNo + "\nMarks : " + marks) ;
        } }