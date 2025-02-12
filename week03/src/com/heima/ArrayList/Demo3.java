package com.heima.ArrayList;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Integer> list=new ArrayList<>();
        //2.添加元素
        list.add(1);
        list.add(2);
        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
