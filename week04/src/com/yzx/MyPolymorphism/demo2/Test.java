package com.yzx.MyPolymorphism.demo2;

public class Test {
    public static void main(String[] args) {
        Animal a=new Dog();
//        System.out.println(a.name);//动物
//        a.show();//Dog---show方法
        //a.eat(); 报错

//        Dog d=(Dog) a; //解决方案：变成子类类型
//        d.eat();

/*        if (a instanceof Dog){
            Dog d= (Dog) a;
            d.eat();
        } else if (a instanceof Cat) {
            Cat c=(Cat) a;
            c.eat();
        }else {
            System.out.println("没有这个类型，无法转换");
        }*/
        //新特性
//        if (a instanceof Dog d){
//            d.eat();
//        } else if (a instanceof Cat c) {
//            c.eat();
//        }else {
//            System.out.println("没有这个类型，无法转换");
//        }
    }
}
class Animal{
    String name="动物";
    public void show(){
        System.out.println("Animal---show方法");
    }

}

class Dog extends Animal{
    String name="狗";

    @Override
    public void show() {
        System.out.println("Dog---show方法");
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
class Cat extends Animal{
    String name="猫";

    @Override
    public void show() {
        System.out.println("Cat---show方法");
    }
    public void eat(){
        System.out.println("猫吃小鱼干");
    }
}
