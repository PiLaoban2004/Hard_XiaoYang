package com.yzx.a02extendsdemo2;

public class Test {
    public static void main(String[] args) {
        OverseaStudent os = new OverseaStudent();
        os.lunch();
        Student s = new Student();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class OverseaStudent extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
    //方法重写
    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }
    @Override
    public void drink() {
        System.out.println("喝可乐");
    }
}

class Student extends Person {

    public void lunch() {
        this.eat();
        this.drink();
    }
}

