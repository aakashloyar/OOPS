package com.aakash.OOPs1;

public class classes {
    public static void main(String[] args) {
        Car c1=new Car();
        Boy b1=new Boy();
        Boy b2=new Boy("aakash");

    }
}
class Car {
    //if undeclared then default constructor
}
class Boy {
    Boy() {
        //this is a constructor
    }
    Boy(String name) {

    }
}