package com.yzx.MyPolymorphism.demo3.Try;

public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /*keepPet(Dog dog,String somethind)方法打印内容如下：
    年龄为30岁的老王养了一只黑颜色的2岁的狗
    2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    keepPet(Cat cat,String somethind)方法打印内容如下：
    年龄为25岁的老李养了一只灰颜色的3岁的猫
    3岁的灰颜色的猫眯着眼睛侧着头吃鱼*/
    public void eat(String something){
        System.out.println("动物在吃"+something);
    }
}
