package com.heima.Test9;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.正确的账号密码
        String Rightusername = "abc";
        String Rightpassword = "123456";

        //2.模拟用户登录，获取用户输入内容
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //3.比较，提示
            if (username.equals(Rightusername) && password.equals(Rightpassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("用户登录失败，账号" + username + "已被锁定");
                } else {
                    System.out.println("用户登录失败，账号或密码有误，请重试,您还剩余" + (2 - i) + "次机会");
                }
            }
        }
    }
}
