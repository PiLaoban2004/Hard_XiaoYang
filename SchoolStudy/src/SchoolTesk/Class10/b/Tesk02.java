package SchoolTesk.Class10.b;

import java.util.Scanner;

public class Tesk02 {
    /*任务二:学生成绩分析关键算法(30分)
    输入两个学生成绩m和n，输出其最大公约数和最小公倍数。
    注意:综合使用分支、循环结构语句实现。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个学生成绩m和n,空格隔开");
        int m = sc.nextInt();
        int n = sc.nextInt();
        //调用方法
        int gcd = getGCD(m, n);
        int lcm = getLCM(m, n);
        System.out.println(gcd);
        System.out.println(lcm);
    }

    //输出最大公约数的方法
    public static int getGCD(int m, int n) {
        if (n == 0) {
            return m;
        }
        return getGCD(n, m % n);
    }

    //输出最小公倍数的方法
    public static int getLCM(int m, int n) {
        return (m * n) / getGCD(m, n);
    }
}
