package com.heima.Test9;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();
        String str2 = "abc";
        boolean result1 = str1.equals(str2);
        System.out.println(result1);
    }
}
