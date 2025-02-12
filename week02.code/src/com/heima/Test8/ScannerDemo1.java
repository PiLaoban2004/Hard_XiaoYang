package com.heima.Test8;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个小数：");
        //2.使用Scanner对象的方法获取小数
        double v = sc.nextDouble();
        System.out.println(v);
    }
}
