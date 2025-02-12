package com.yzx.a01exendsdemo1;

public class Test {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.show();
    }
}

class Fu{
    String name="Fu";
    String hobby="喝茶";


}

class Zi extends Fu{
    String name="Zi";
    String game="吃鸡";

    public void show(){
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(super.hobby);
        System.out.println(game);
    }
}

