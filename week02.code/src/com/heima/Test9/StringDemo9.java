package com.heima.Test9;

public class StringDemo9 {
    public static void main(String[] args) {
        //1.获取要说的话
        String str = "你玩的真好，下次不要玩了，CNM，SB。";
        //2.定义一个敏感词库
        String[] arr = {"CNM","SB"};
        //3.遍历敏感词库
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "***");
        }
        System.out.println(str);
    }
}
