package SchoolTesk.Class5.b;

import java.util.Scanner;

public class Tesk02 {
    /*任务二:规律数字计算关键算法(30分)
    计算算式1+2^1+2^2+2^3+…+2^n的值。
    注意:n由键盘输入，且2≤n≤10。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数n，满足2<=n<=10");
            int n = sc.nextInt();
            if (n<2||n>10){
                System.out.println("输入无效，请重新输入");
            }else {
                double result=Math.pow(2,n-1);
                System.out.println(result);
                break;
            }

        }


    }
}
