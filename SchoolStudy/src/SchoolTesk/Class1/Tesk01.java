package SchoolTesk.Class1;

import java.util.Scanner;

public class Tesk01 {
    /*任务一:趣味试题1关键算法(30分)
    通过键盘输入某年某月某日，计算并输出这一天是这一年的第几天。例如
    2001年3月5日是这一年的第 64天。
    注意:使用分支结构语句实现。*/
    Scanner sc = new Scanner(System.in);
    int year, month, day;

    public void action() {
        System.out.println("请输入年份：");
        year = sc.nextInt();
        System.out.println("请输入月份：");
        month = sc.nextInt();
        System.out.println("请输入日期：");
        day = sc.nextInt();
        if (year <= 0 || month > 12 || day <= 0 || day > 31) {
            System.out.println("非法输入");
        } else {
            System.out.println("该天是这一年的第 " + getDays() + " 天。");
        }
    }

    private int getDays() {
        int sum = 1;
        for (int i = 0; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum += 30;
                case 2:
                    sum += isLeapYear();
                    break;
            }

        }
        return sum;
    }

    public int isLeapYear() {
        int num = 28;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            num = 29;
        }
        return num;
    }

}
