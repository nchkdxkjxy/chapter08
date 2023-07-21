package com.dlh.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack 你好吗斤斤计较");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());


        //如果使用构造器制定属性
        Person smith = new Person("smith", 200, 50000);
        System.out.println("=====smith 的信息=====");
        System.out.println(smith.info());
        //构造器直接调用且不做任何修改，可以绕过get和set，但在构造器中加可以避免。
    }
}
/*
不能随便查看年龄，💰等。年龄必须在1-120，否则给一个默认年龄，name 2-6字符之间。
 */
class Person{
    public String name;//名字公开
    private int age;//age 私有化
    private double salary;

    //构造器


    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //我们可以将set方法写在里面,这样仍可以验证数据
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验,相当于增加业务逻辑
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("名字的长度不对，需要(2-6)个字符，默认名字");
            this.name = "无名氏";
        }
    }

    public int getAge() {
        //可以增加对当前对象的权限判断
        return age;
    }

    public void setAge(int age) {
        //判断
        if(age >= 1 && age <= 120) {
            this.age = age;
        }else{
            System.out.println("你设置的年龄在1-120，给默认年龄18");
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public String info(){
        return  "信息为 name=" + name + " age=" + age +" 💰="+salary;
    }
}
