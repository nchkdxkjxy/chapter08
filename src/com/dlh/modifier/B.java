package com.dlh.modifier;

public class B {
    public void  say(){
        A a = new A();
        //在同一个包下，可以访问public,protected 和默认，但不能访问私有
        System.out.println("n1=" + a.n1+ "n2="+a.n2+"n3= "+a.n3+"n4=");
        a.m1();
        a.m2();
        a.m3();
    }
}
