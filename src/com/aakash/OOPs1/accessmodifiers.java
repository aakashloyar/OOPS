package com.aakash.OOPs1;

public class accessmodifiers {
    public static void main(String[] args) {
        Box b1=new Box(1,2,3,4);//b1 is object/instance of class Box
        //int x=b1.a;-> give error as a is private
        int b=b1.b;
        int c=b1.c;
        int d=b1.d;

    }
}
//public class Box//*** <>
class Box {//cannot declare public here*** bcz it mush have same name as it's file
    private int a;//access only in same class
    int b;//anywhere in package
    protected int c;//anywhere in package and through sublass in another package
    public int d;//anywhere

    Box(int x, int b, int c, int d) {
        this.a=x;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    int func1() {
        int x=this.a;//inside same class we can get private
        return x;
    }

}

