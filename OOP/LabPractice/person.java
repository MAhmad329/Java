package LabPractice;

public class person {
    protected String name ;
    protected String id ;
    protected String phone ;
    public person() {
    name = "NaginaNazar" ;
    id = "sp14bcs039" ;
    phone = "001" ;
    }
    public person(String a , String b , String c) {
    name = a ;
    id = b ;
    phone = c ;
    }

    public void setName(String a){
        name = a ;
        }
        public void setId(String j){
        id = j ;
        }
        public void setPhone(String a) {
        phone = a ;
        }
        public String getName() {
        return name ;
        }
        public String getid() {
        return id ;
        }
        public String getPhone() {
        return phone ;
        }
        public String toString( ) {
        return("Name : " + name + "ID : " + id + "Phone : " + phone ) ;
        }
        }
        