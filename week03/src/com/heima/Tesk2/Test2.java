package com.heima.Tesk2;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*生成验证码
          内容：可以是小写字母，也可以是大写字母，还可以是数字
          规则：
          长度为5
          内容中是四位字母，1位数字。
          其中数字只有1位，但是可以出现在任意的位置*/
        //1.把所有大写字母，小写字母都放到一个数组当中
        char[] arr = new char[52];
        int index = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            arr[index++] = i;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            arr[index++] = i;
        }
        //2.从数组中随机获取4次
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(52);
            sb.append(arr[num]);
        }
        //3.生成一个0~9的随机数拼接到最后
        int num2 = r.nextInt(10);
        sb.append(num2);
        //4.把字符串转换成字符数组
        String str = sb.toString();
        char[] arr2 = str.toCharArray();
        //再让最后一个元素和前面的随机位置的元素进行交换 abcd0
        int num3 = r.nextInt(4);//2 0 1 3->0
        char temp = arr2[4];//temp=0
        arr2[4] = arr2[num3];//0=c a b d
        arr2[num3] = temp;//c=0
        System.out.println(new String(arr2));
    }
}
