package com.dlh.encap;

public class Account {
    //为了封装，将3个属性设置为private
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器
    //可以没有默认值

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }
    //姓名(2-4)
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else{
            System.out.println("要求姓名(2-4)");
            this.name = "无名氏";
        }
    }

    public double getBalance() {
        return balance;
    }
    //余额( >20)
    public void setBalance(double balance) {
        if(balance > 20 ) {
            this.balance = balance;
        }else {
            System.out.println("要求余额大于20");
            //this.balance = 0;属性默认就是0；
        }
    }

    public String getPwd() {
        return pwd;
    }
    //密码(6)
    public void setPwd(String pwd) {
        if( pwd.length() == 6) {
            this.pwd = pwd;
        }else{
            System.out.println("密码(6),否则默认000000");
            this.pwd = "000000";
        }
    }
    //显示账号信息
    public void showInfo(){
        System.out.println("账号信息 name=" + name + " 余额 balance =" + balance + " 密码 pwd =" + pwd);
    }

}
/**
 * Accound类要求具有属性：姓名(2-4)、余额( >20)、密码(6)不满足给默认值
 */
