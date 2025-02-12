package SchoolTesk.Class8.a;

import java.util.Scanner;

public class Tesk01 {
    /* 任务一:统计今天是该年的第几天关键算法(30分)
     从键盘上输入一个年份值和一个月份值，输出该月的天数。(说明:一年有
     12个月，大月的天数是31，小月的天数是30。2月的天数比较特殊，遇到闰年
     是29天，否则为28天。例如，输入2011、3，则输出31天。)
     注意:使用分支结构语句实现。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份值和一个月份值，空格隔开");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int days = 0;
        if (month > 0 || month < 12) {
            switch (month) {
                case 2:
                    days = isLeapYear(year) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }
        }
        System.out.println(year+"年"+month+"月共有"+days+"天");
    }

    //判断是否为闰年的方法能被 4 整除而不能被 100 整除。 2。能被 400 整除
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
