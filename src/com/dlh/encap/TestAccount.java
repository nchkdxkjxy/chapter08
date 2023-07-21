package com.dlh.encap;

public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(69);
        account.setPwd("123456");

        account.showInfo();

    }

}
