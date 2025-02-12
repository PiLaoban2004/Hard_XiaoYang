package com.heima.Test10;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();
        //2.添加字符串
        sb.append("aaa").append("bbb").append("ccc");


        System.out.println(sb);

        //3.再把StringBuilder变成字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
