package com.company;

public class Main {

    public static void main(String[] args) {
	Person A= new Person("Saptesate","Ion",20,173,"Caprui");
	Person B= new Person("Balmus","Ana",22,180,"verzi");
	System.out.println(A);
	System.out.println(B);
	A.setAge(21);
	A.setHeight(174);
        B.setCul_ochi("Negri");
        B.setFname("Bogaci");
        System.out.println(A);
        System.out.println(B);
    }
}
