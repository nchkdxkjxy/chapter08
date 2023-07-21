package com.dlh.pkg;

import com.dlh.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下只能访问public修饰的方法或属性
        System.out.println("不同包下访问：n1="+a.n1);
        a.m1();
        //不能访问m2,m3,m4
    }
}
