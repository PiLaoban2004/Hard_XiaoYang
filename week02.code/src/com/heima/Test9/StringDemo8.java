package com.heima.Test9;

public class StringDemo8 {
    public static void main(String[] args) {
        //1.定义一个字符串，记录身份证信息
        String idCard = "430424200402100194";
        //2.截取字符串，获取出生年月日和性别
        String year = idCard.substring(6, 10);
        String month = idCard.substring(10, 12);
        String day = idCard.substring(12, 14);

        System.out.println("人物信息位：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        //3.获取性别
        char gender = idCard.charAt(16);
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别：女");
        } else {
            System.out.println("性别：男");
        }
    }
}
