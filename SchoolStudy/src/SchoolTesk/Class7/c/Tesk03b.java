package SchoolTesk.Class7.c;

import java.util.Scanner;

public class Tesk03b {
    /*  任务三:筛选奇数问题关键算法(30分)
      编写程序实现:从键盘输入正整数s(5位以内)，从低位开始取出s中的
      奇数位上的数，依次构成一个新数t，高位仍放在高位，低位仍放在低位，最
      后在屏幕上输出 t。例如，当s中的数为76121时，t中的数为711。
      注意:使用循环结构语句实现。*/
    public static void main(String[] args) {
        //键盘输入正整数s(5位以内)
        Scanner sc=new Scanner(System.in);
        System.out.println("键盘输入正整数s(5位以内)");
        int m = sc.nextInt();
        if (m<0||m>99999){
            System.out.println("非法输入，请重新输入 ");
            return;
        }
        int result = getNum(m);
        System.out.println(result);
    }

    //定义一个筛选方法
    public static int getNum(int s) {
        int t=0;
        int keepWeShu=1;//保持位数

        int count=1;//位置计数，最低为一位
        while (s>0){
            int tiQu = s % 10;//提取当前位的数字

            if (count%2!=0){

                if (tiQu%2!=0){
                    t=t+tiQu*keepWeShu;
                    keepWeShu*=10;
                }
            }
            s/=10;
            count++;
        }
        return t;
    }
}
