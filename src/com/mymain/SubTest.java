package com.mymain;
import test.Test;

public class SubTest extends Test {
    SubTest(){
        super(2);
    }
    public void printMax( int a,double... numbers) {
        System.out.println("The first value is " + a);
    }

    public void bark(){
        System.out.println("狗可以跑和睡");
    }

}
