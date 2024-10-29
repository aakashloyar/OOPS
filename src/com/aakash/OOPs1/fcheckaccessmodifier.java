package com.aakash.OOPs1;

public class fcheckaccessmodifier {
    public static void main(String[] args) {
        Box b1=new Box(1,2,3,4);
        //int a=b1.a;//here also only private is inaccessible
        int b=b1.b;
        int c=b1.c;
        int d=b1.d;
    }
}
