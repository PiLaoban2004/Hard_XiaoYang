package SchoolTesk.Class10.a;

import java.util.Scanner;

public class Tesk01 {
    /*任务一
    学生成绩分类关键算法(30分)
    输入10个学生的分数(0-100的整数)，
    输出相应的等级。
    “学习成绩>=90分”的同学用A表示，
    “60<=学习成绩<90”的同学用B表示，
     60分以下的用C表示。
    注意:使用分支结构语句实现。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入10个学生的分数 空格隔开");
        //用数组接收10个数据
        int[] score = new int[10];
        //遍历
        for (int i = 0; i < 10; i++) {
            score[i] = sc.nextInt();
            //判断是否为整数
            if (score[i]<0||score[i]>100){
                System.out.println("输入不规范");
                break;
            }
            //判断区间
            if (score[i] >= 0 && score[i] < 60) {
                System.out.println("C");
            } else if (score[i] >= 60 && score[i] <= 90) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }

    }
}
