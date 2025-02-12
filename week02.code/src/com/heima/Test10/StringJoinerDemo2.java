package com.heima.Test10;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj=new StringJoiner("-","[","]");

        //2.添加元素
        sj.add("2004").add("02").add("10");
        int len = sj.length();

        //3.输出数据
        System.out.println(sj);
        System.out.println(len);
        String str = sj.toString();
        System.out.println(str);

    }
}
