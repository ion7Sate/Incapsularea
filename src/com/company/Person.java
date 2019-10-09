package com.company;

public class Person {
    private String fname;
    private String lname;
    private int age;
    private float  height;
    private String  cul_ochi;

    Person(String fname,String lname,int age,float height,String cul_ochi){
       this.fname=fname;
       this.lname=lname;
       this.age=age;
       this.height=height;
       this.cul_ochi=cul_ochi;
    }
public String getFname(){
        return this.fname;
}
public String getLname(){
        return this.lname;
}
public int getAge(){
        return this.age;
}
public float getHeight(){
        return this.height;
}
public String getCul_ochi(){
        return this.cul_ochi;

}
public void setFname(String fname){
this.fname=fname;
}
public void setLname(String lname){
        this.lname=lname;
}
public void setAge(int age){
        this.age=age;
}
public void setHeight(float height){
        this.height=height;
}
public void setCul_ochi(String cul_ochi){
        this.cul_ochi=cul_ochi;
}
    public String toString() {
        return "El/Ea este " +fname + " " +lname + " el/ea are " +age + " ani" + " si are " +height+" cm inaltime "+" si are culoare ochilor  "+cul_ochi;

    }
}
