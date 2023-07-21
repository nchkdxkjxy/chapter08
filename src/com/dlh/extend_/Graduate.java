package com.dlh.extend_;
//大学生->模拟大学生考试的简单情况。
public class Graduate {
    public String name;
    public int age;
    private double score;
    //考完后设置成绩
    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        //输出快捷键 sout
        System.out.println("大学生" + name + "正在考大学数学...");
    }
    public void  showInfo(){
        System.out.println("大学生名"+ name+ "年龄"+ age+"分数"+score);
    }
}
