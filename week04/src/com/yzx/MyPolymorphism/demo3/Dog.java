package com.yzx.MyPolymorphism.demo3;

public class Dog extends Animal {
    //空参、全参构造
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }
    //行为

    @Override
    public void eat(String something) {
        System.out.println(+getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
