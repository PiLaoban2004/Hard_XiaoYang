package com.yzx.MyExtends.demo3;

public class Students extends Person{
    public Students() {
//    子类构造方法中隐藏的super()去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }

    public Students(String name, int age) {
        super(name, age);
    }
}
