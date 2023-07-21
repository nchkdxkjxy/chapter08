package com.dlh.extend_;
//小学生->模拟小学生考试的情况
public class Pupil {
    public String name;
    public int age;
    private double score;
//这里可以用快捷 set
    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        //输出快捷键 sout
        System.out.println("小学生" + name + "正在考小学数学...");
    }
    public void  showInfo(){
        System.out.println("小学生名"+ name+ "年龄"+ age+"分数"+score);
    }
}
