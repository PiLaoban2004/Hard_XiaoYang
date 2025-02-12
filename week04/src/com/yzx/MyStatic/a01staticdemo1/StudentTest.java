package com.yzx.MyStatic.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.TeacherName="痞老板老师";
        //创建一个学生对象
        Student s1=new Student();
        //赋值
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //调用方法
        s1.study();
        s1.show();

        //创建第二个
        Student s2=new Student();
        //赋值
        s2.setName("李四");
        s2.setAge(21);
        s2.setGender("女");
        //调用方法
        s2.study();
        s2.show();
    }

}
