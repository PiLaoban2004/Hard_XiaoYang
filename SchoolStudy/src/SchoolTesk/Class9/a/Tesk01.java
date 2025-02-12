package SchoolTesk.Class9.a;

import java.util.Scanner;

public class Tesk01 {
   /* 任务一:主结长度关键算法(30分)
    公司现在需要打印中国结的主结(位于中间，最大的那一个结)，为了打印
    出漂亮新颖的主结，于是设计打印主结的长度满足可以被7整除这个条件。现
    在公司需要统计某个范围内能被7整除的整数的个数，以及这些能被7整除的
    数的和。
    从键盘上输入一个整数N(10<N<100)，输出1~N之间能被7整除的整数
    的个数，以及这些能被7整除的数之和。*/
   public static void main(String[] args) {
       //键盘录入
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入一个整数N，(10<N<100)");
       int N = sc.nextInt();
       if (N<=10||N>=100){
           return;
       }
       //定义一个计数器
       int count=0;
       int total = 0;
       for (int i = 1; i < N; i++) {
           if (i%7==0){
               count++;
               total=total+i;
           }
       }
       System.out.println("能被7整除的整数的个数:"+count+"个");
       System.out.println("能被7整除的数的和为:"+total);
   }
}
