package SchoolTesk.Class4.b;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tesk02 {
    /*任务二:求两个坐标点长度的关键算法(30分)
    输入两点坐标(x1,y1)，(x2,y2),计算并输出两点间的距离。输入数据
    由4个浮点数组成，分别表示x1,y1,x2,y2,数据之间用空格隔开。例如输入:
            1346则输出:4.24
    注意:长度公式为、(x1-x2)+(y1-y2)，结果保留两位小数。*/
    public static void main(String[] args) {
        //输入两点坐标
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两点坐标,空格隔开");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        //调用方法
        double result = countNum(x1, y1, x2, y2);
        DecimalFormat df=new DecimalFormat("#.00");
        String format = df.format(result);
        System.out.println(format);

    }
    //计算距离的方法
    public static double countNum(double x1,double y1,double x2,double y2){
        double v = x1 - x2;
        double v1 = y1 - y2;
        double total=v+v1;
        return total;
    }
}
