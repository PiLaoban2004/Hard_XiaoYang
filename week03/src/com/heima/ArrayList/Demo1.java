package com.heima.ArrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //1.创建ArrayList对象(增删改查）
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //3.删除
        String str = list.remove(2);
        System.out.println(str);
        System.out.println(list);
        //4.修改
        String result = list.set(1, "赵六");
        System.out.println(result);
        System.out.println(list);
        //5.查询
        String s = list.get(1);
        System.out.println(s);
        //6.遍历
        for (int i = 0; i < list.size(); i++) {
            //i索引
            //list.get(i)获取元素
            String str1 = list.get(i);
            System.out.println(str1);
        }
    }
}
