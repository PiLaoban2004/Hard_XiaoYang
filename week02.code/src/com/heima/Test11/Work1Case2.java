package com.heima.Test11;

import java.util.Scanner;
import java.util.StringJoiner;

public class Work1Case2 {
    public static void main(String[] args) {
        /*键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
                将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：1	Ⅰ  2Ⅱ 3Ⅲ 4Ⅳ 5Ⅴ 6Ⅵ 7Ⅶ 8Ⅷ 9Ⅸ
        注意点：
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成“ ”（长度为0的字符串）*/
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串：");
            str = sc.next();
            //校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前输入不符合规定,请输入一个小于等于9的数字");
            }
        }
        //将内容变成罗马数字
        //下面是阿拉伯数字跟罗马数字的对比关系：1Ⅰ  2Ⅱ 3Ⅲ 4Ⅳ 5Ⅴ 6Ⅵ 7Ⅶ 8Ⅷ 9Ⅸ
        //查表法
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String result = changeStr(c);
            sj.add(result);
        }

        System.out.println(sj);
    }

    //3.创建一个将数字改为罗马数字的方法
    public static String changeStr(int num) {
       String str=switch (num) {
           case '0'->" ";
           case '1'->"Ⅰ";
           case '2'->"Ⅱ";
           case '3'->"Ⅲ";
           case '4'->"Ⅳ";
           case '5'->"Ⅴ";
           case '6'->"Ⅵ";
           case '7'->"Ⅶ";
           case '8'->"Ⅷ";
           case '9'->"Ⅸ";
           default ->"";
       };
       return str;
    }

    //2.创建一个判断方法
    public static boolean checkStr(String str) {
        //要求1：长度为小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
