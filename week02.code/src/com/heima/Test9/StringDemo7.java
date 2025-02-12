package com.heima.Test9;

public class StringDemo7 {
    public static void main(String[] args) {
        //1.获取一个手机号
        String phoneNumber = "13212695368";
        //2.获取手机号前三位
        String start = phoneNumber.substring(0, 3);
        //3.获取手机号后四位
        String end = phoneNumber.substring(7);
        //4.拼接成新的手机号
        String newPhoneNumber = start + "****" + end;
        //5.打印
        System.out.println(newPhoneNumber);
    }
}
