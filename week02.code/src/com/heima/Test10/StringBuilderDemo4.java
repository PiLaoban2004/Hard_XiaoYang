package com.heima.Test10;

import java.util.Scanner;
/*
        需求：键盘录入一个字符串，判断是否是对称字符串
        例如：abcba是对称字符串，abcba是对称字符串
     */
public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2.将字符串进行反转
        String result = new StringBuilder().append(str).reverse().toString();


        //3.判断
        if (str.equals(result)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
