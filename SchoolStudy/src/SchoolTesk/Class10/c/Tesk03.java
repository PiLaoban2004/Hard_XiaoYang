package SchoolTesk.Class10.c;

import java.util.Scanner;

public class Tesk03 {
    /*任务三:学生成绩排序关键算法
    输入10个学生的分数(0-100的整数)，
    将分数存入数组，并对数组中的学生成绩按升序进行排序、输出，
    注意:综合使用分支、循环结构语句实现，直接输出结果不计分。*/
    public static void main(String[] args) {
        //键盘录入存入数组
        Scanner sc = new Scanner(System.in);
        System.out.println("输入10个学生的分数");
        int[] score = new int[10];

        //遍历
        for (int i = 0; i < 10; i++) {
            score[i] = sc.nextInt();
        }
        //冒泡排序
        for (int i = 0; i < score.length-1; i++) {
            for (int j = 0;j < score.length-1-i; j++) {
                if (score[j]>score[j+1]){
                    int temp=score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                }
            }
        }
        //遍历并打印排序后的成绩
        for (int i = 0; i < score.length; i++) {
            int num=score[i];
            System.out.println(num);
        }
    }
}
