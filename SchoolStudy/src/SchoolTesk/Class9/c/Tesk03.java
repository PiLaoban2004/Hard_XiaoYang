package SchoolTesk.Class9.c;

import java.util.Scanner;

public class Tesk03 {
    /*任务三:打印中国结图案关键算法(30分)
    由于中国结的形状是菱形图案，所以现在公司需要设计一个打印菱形的方法
    从键盘输入一个整数N，打印出有 N*2-1行的萎形。
    例如输入整数4，则屏幕输出如下菱形。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("键盘输入一个整数N");
        int N = sc.nextInt();
        printRhombus(N);
    }
    //构建一个打印菱形的方法
    public static void printRhombus(int N){
        //打印上半部分
        for (int i = 1; i <= N; i++) {
            //打印空格
            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }
            //打印星号
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印下半部分
        for (int i = N-1; i >= 1; i--) {
            //打印空格
            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }
            //打印星号
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
