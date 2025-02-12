package com.heima.ArrayList;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //遍历
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
