package com.dlh.extend_;

public class Extends01 {
    //快捷方式 main
    public static void main(String[] args) {
        //.var
        Pupil pupil = new Pupil();
        pupil.name = "小白";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("=============");
        Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 24;
        graduate.testing();
        graduate.setScore(89);
        graduate.showInfo();
    }
}
