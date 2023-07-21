package com.dlh.extend_.improve_;

import com.dlh.extend_.Graduate;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小白";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("=============");
        com.dlh.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 24;
        graduate.testing();
        graduate.setScore(89);
        graduate.showInfo();
    }
}
