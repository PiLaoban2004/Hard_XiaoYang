package SchoolTesk.Class6.a;

import java.util.Scanner;

public class Tesk01 {
    /*任务一:合并数字检测关键算法(30分)
    请编写函数(或方法)fun，其功能是:将两个两位数的正整数a、b合并形
    成一个整数放在c中。合并的方式是:将a数的十位和个位数依次放在c数个
    位和十位上，b数的十位和个位数依次放在c数的百位和千位上。
    例如，当a=16、b=35时，则c=5361。
    注意:其中，a、b为函数(或方法)fun的输入参数，c为函数(或方法)fun
    的返回值。*/
    public static void main(String[] args) {
        int m, n;
        //键盘录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入两个两位数的正整数");
            m = sc.nextInt();
            n = sc.nextInt();
            if (m >= 10 && m <= 99 && n >= 10 && n <= 99) {
                if (m < 0 && n < 0) {
                    System.out.println("输入有误，请重新输入");
                } else {
                    break;
                }
            } else {
                System.out.println("输入有误");
            }

        }
        //调用方法
        int result = fun(m, n);
        System.out.println(result);
    }

    //编写函数(或方法)fun
    public static int fun(int a, int b) {
        //将两个两位数的正整数a、b合并形成一个整数放在c中。
        // 合并的方式是:将a数的十位和个位数依次放在c数个位和十位上，
        // b数的十位和个位数依次放在c数的百位和千位上。
        int c = 0;
        //分别拿出a的个位和十位
        int ge = a % 10;
        int shi = a / 10;
        //拿出b的十位和个位
        int ge2 = b % 10;
        int shi2 = b / 10;
        //合并
        c = ge * 10 + shi + shi2 * 100 + ge2 * 1000;
        return c;
    }
}

