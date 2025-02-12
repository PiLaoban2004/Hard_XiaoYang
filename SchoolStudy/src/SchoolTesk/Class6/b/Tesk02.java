package SchoolTesk.Class6.b;

import java.util.Scanner;

public class Tesk02 {
    /* 任务二:猴子吃桃试题检测关键算法(30分)
    孙悟空在大闹蟠桃园的时候，第一天吃掉了所有桃子总数一半多一个。
    第二天又将剩下的桃子吃掉一半多一个，以后每天吃掉前一天剩下的一半多一个，
    到第 n 天准备吃的时候只剩下一个桃子。
    请帮忙计算一下，第一天开始吃的时候桃园一共有多少个桃子。
    注意: ①使用循环结构语句实现。
          ②整数 N 由键盘输入，且 2 ≤ N ≤ 10。
    */

    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("请输入N天 (2 ≤ N ≤ 10):");
            n = sc.nextInt();
            if (n < 2 || n > 10) {
                System.out.println("输入有误,请重新输入");
            } else {
                break;
            }
        }

        // 计算原来桃子的总数
        int total = 1; // 第 n 天剩下的桃子数量
        for (int i = 1; i < n; i++) {
            total = (total + 1) * 2; // 反推计算
        }

        System.out.println("第一天开始吃的时候桃园一共有 " + total + " 个桃子");
    }
}
