package com.dlh.modifier;

public class A {
    //四个属性，分别使用。修饰属性
    public  int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private  int n4 = 400;
    public void m1(){
        //该方法的四个属性
        System.out.println("n1="+ n1 + " n2=" + n2 +" n3=" + n3 + " n4=" + n4);
    }
    //同样可以修饰方法
    protected void m2(){}
     void m3(){}
    private void m4(){}
    public void hi(){
        //在同一个类中，可以访问 4 个修饰的方法
        m1();
        m2();
        m3();
        m4();
    }

}
