package com.dlh.extend_;

public class Sub extends  Base{//子类
    public Sub(String name, int age){
        //1.要调用父类的无参构造器
//        super();//父类的无参构造器或者什么都不写
        //2.调用父类的Base(String name)有参构造器
        super("dlh");
        System.out.println("子类的Sub(String name, int age)构造器被调用...");
    }
    public Sub(){//构造器
        super("smith",10);
        System.out.println("sub()...");
    }
    //当创建子类对象时，不管是用子类的那个构造器，默认情况下总会去调用父类的无参构造器，
    public Sub(String name){
        super("nike",29);
        //do nothing...
        System.out.println("子类的Sub(String name)构造器被调用...");
    }
    public  void say0k(){//子类方法
        //父类的非private 属性和方法都可以访问
        System.out.println(n1+ " "+n2+" "+n3);
        test100();
        test200();
        test300();
        //通过父类提供公共方法去访问。
        System.out.println("n4=" +getN4());
        callTest400();//

    }
//子类与父类在同一个包下，子类可以访问父类默认修饰符修饰的属性
    //子类与父类在同一个包下，子类可以访问父类默认修饰符修饰的属性
}
