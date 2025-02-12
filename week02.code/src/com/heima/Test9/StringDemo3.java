package com.heima.Test9;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //统计----计数器思想
        //定义三个计数器
        int big = 0;
        int small = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            //i表示字符串的索引
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                //char类型可以直接使用比较运算符
                small++;
            } else if (ch >= 'A' && ch <= 'Z') {
                big++;
            } else if (ch >= '0' && ch <= '9') {
                num++;
            }else {
                System.out.println("输入有误");
            }
        }
        //输出打印
        System.out.println("大写字母有" + big + "个");
        System.out.println("小写字母有" + small + "个");
        System.out.println("数字有" + num + "个");
    }
}
