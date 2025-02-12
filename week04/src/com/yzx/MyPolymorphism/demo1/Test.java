package com.yzx.MyPolymorphism.demo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t=new Teacher();
        t.setName("王建国");
        t.setAge(30);

        Administration admin=new Administration();
        admin.setName("管理员");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);
    }
    //这个方法能接收老师，学生和管理员
    //只能把参数写出三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
