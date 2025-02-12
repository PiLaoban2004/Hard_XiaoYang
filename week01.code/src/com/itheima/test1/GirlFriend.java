package com.itheima.test1;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    //set,get方法

    //给成员变量name进行赋值
    public void setName(String name) {
        this.name = name;
    }

    //get 对外提供name属性
    public String getName() {
        return name;
    }
    //age
    public void setAge(int age) {
        if (age >= 18 && age <= 24) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }
    public int getAge() {
        return age;
    }
    //gender
    public void setGender(String gender) {
        this.gender = gender;

    }
    public String getGender() {
        return gender;
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
}
