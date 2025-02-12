package com.heima.Tesk2;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面内容
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入任意字符串：");
        String str = sc.next();

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //得到随机索引
            Random r=new Random();
            int index = r.nextInt(arr.length);
            char temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        String result=new String(arr);

        System.out.println(result);
    }
}
