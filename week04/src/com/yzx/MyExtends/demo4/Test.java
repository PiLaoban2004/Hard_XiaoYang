package com.yzx.MyExtends.demo4;

public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用
        Manager m=new Manager("001","zhangsan",10000,8000);
        System.out.println(m.getId()+", "+m.getName()+", "
                +m.getSalary()+", "+m.getBouns());
        m.work();
        m.eat();




        Cook c=new Cook();
        c.setId("002");
        c.setName("lisi");
        c.setSalary(8000);
        System.out.println(c.getId()+", "+c.getName()+", "
                +c.getSalary());
        c.work();
        c.eat();
    }
}
