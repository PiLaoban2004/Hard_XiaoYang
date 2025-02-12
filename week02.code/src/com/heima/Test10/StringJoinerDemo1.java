package com.heima.Test10;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1.创建StringJoiner对象,指定分隔符
        StringJoiner sj=new StringJoiner(",");
        //2.添加元素
        sj.add("hello").add("world").add("java");
        //3.输出
        System.out.println(sj);
    }
}
