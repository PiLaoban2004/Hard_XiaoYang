package SchoolTesk.Class4.a;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tesk01 {
    /*任务一:计算球体积的关键算法(30分)
    根据输入球的半径值r，输出球的体积 V=4*PI*r3/3。体积，计算结果保留
    三位小数。PI=3.1415927;
    例如:输入2输出33.510
    注意:使用公式完成。*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个球的半径r");
        double r = sc.nextDouble();
        double result = countV(r);
        String finalNum = returnCount(result);
        System.out.println(finalNum);
    }
    //创建一个使用公式的方法
    public static double countV(double r){
        double V=0;
        double pi=3.1415926;
        double pow = Math.pow(r, 3);
        V=(4*pi*pow)/3;
        return V;
    }
    //创建一个保留3位小数的方法
    public static String returnCount(double num){
        DecimalFormat df=new DecimalFormat(".000");
        String str=df.format(num);
        return str;
    }
}
