package com.yzx.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建一个集合用来存储学生对象
        ArrayList<Student> list=new ArrayList<>();
        //创建三个学生对象
        Student s1=new Student("zhangsan",22,"男");
        Student s2=new Student("lisi",23,"女");
        Student s3=new Student("wangwu",24,"男");
        //添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //调用工具类的方法
        int max = StudentUtil.getMax(list);
        System.out.println(max);
    }
}
