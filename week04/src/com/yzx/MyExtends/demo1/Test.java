package com.yzx.MyExtends.demo1;

public class Test {
    public static void main(String[] args) {
        Ragdoll r=new Ragdoll();
        r.eat();
        r.drink();
        r.catchMouse();
        System.out.println("------------");
        Husky h=new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
