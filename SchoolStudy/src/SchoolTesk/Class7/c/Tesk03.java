package SchoolTesk.Class7.c;

import java.util.Scanner;

public class Tesk03 {
    /*  任务三:筛选奇数问题关键算法(30分)
      编写程序实现:从键盘输入正整数s(5位以内)，从低位开始取出s中的
      奇数位上的数，依次构成一个新数t，高位仍放在高位，低位仍放在低位，最
      后在屏幕上输出 t。例如，当s中的数为76121时，t中的数为711。
      注意:使用循环结构语句实现。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个五位数的正整数");
        int s = sc.nextInt();
        if (s < 0 || s > 99999) {
            System.out.println("输入不符合5位以内整数，请重新输入");
            return;
        }
        int result = getNum(s);
        System.out.println(result);
    }

    //定义一个筛选方法
    public static int getNum(int s) {
        int t = 0;
        int multiplier = 1;//用于保持位数

        int position = 1;//位置计数。最低位为一位
        while (s > 0) {//123
            int currentDigit = s % 10; //提取当前位的数字 3
            //如果是奇数位
            if (position % 2 != 0) {
                //如果是奇数数字，则添加到t中
                if (currentDigit % 2 != 0) {
                    t = t + currentDigit * multiplier;//t=0+3*1 t=0+1*100
                    multiplier *= 10;//保持新数的位置正确 10
                }
            }
            //去掉最低位，继续处理下一个数字 3 2 1
            s /= 10;
            position++;//位置加1 2 3
        }
        return t;
    }
}
