package com.heima.Test9;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入需要录入的金额");
            money = sc.nextInt();
            if (money>=0 && money<=9999999){
                break;
            }else {
                System.out.println("输入金额不合法");
            }
        }
        //定义一个字符串，存储大写的数字
        String moneyStr = "";

        //得到money的每一位数字,再转成中文
        while (true){
            //从右往左获取数据，因为右侧是数据的个位
            int ge=money%10;
            String capitalNumber = getCapitalNumber(ge);
            //把转换之后的大写拼接到moneyStr中
            moneyStr = capitalNumber + moneyStr;
            //去掉刚刚获取的数据
            money=money/10;
            //如果数字的每一位全部获取到了，那么money记录的就是0，此时循环结束
            if (money==0){
                break;
            }
        }
        //再得到的数字前面补零
        int count=7- moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //插入单位
        //定义一个数组，存储单位
        String []arr={"佰","拾","万","仟","佰","拾","元"};
        String result="";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            //把大写数字和单位拼接到result中
            result=result+c+arr[i];

        }
        System.out.println(result);
    }


    //定义一个方法把数字变成大写的中文
    public static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
