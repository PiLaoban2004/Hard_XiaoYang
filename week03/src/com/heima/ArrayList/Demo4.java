package com.heima.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.录入学生对象
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s=new Student();
            //键盘录入
            System.out.println("请输入姓名");
            String name=sc.next();
            System.out.println("请输入年龄");
            int age=sc.nextInt();
            //赋值
            s.setName(name);
            s.setAge(age);
            //添加到集合中
            list.add(s);
        }
        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }
}
