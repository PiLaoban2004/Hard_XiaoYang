package com.heima.Test10;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb=new StringBuilder();
        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append("hello");
        //打印对象不是地址值而是属性值
        //反转
        sb.reverse();
        int len = sb.length();
        System.out.println(len);

    }
}
