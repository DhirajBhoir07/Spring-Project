package com.spring.constructorInjection;

public class AmbiguityInCalling {
    private int a;
    private int b;

    public AmbiguityInCalling(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("by calling double  , double type");
    }

    public AmbiguityInCalling(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("by calling int  , int type");
    }

//   It will execute 1st irrespective of its datatype. beacuse xml values comes string by defalut
//   If not metioned type explicitely in xml it will redirect it in this constructor
    public AmbiguityInCalling(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("by calling String  , String type");
    }

    public void sum(){
        System.out.println("The sum of "+a+ " and "+b+" is "+ (a+b));
    }


}
