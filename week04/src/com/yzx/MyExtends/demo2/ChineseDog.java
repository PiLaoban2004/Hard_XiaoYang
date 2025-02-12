package com.yzx.MyExtends.demo2;

public class ChineseDog extends Dog{
    //父类中的方法不能满足我们的需求了，所以需要进行重写
    //而且中华田园犬完全用不到父类中的代码，所以不需要通过super进行重写
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
