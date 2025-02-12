package SchoolTesk.Class1;

import java.util.Scanner;

public class Tesk03 {
    /*判断一个整数是否为“水仙花数”。所谓“水仙花数”是指一个三位的整
    数，其各位数字立方和等于该数本身。例如:153是一个“水仙花数”，
    因为 153=1^3+5^3+3^3。
    注意:用带有一个输入参数的函数(或方法)实现，返回值类型为布尔类
            型*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        //调用方法
        boolean result = isNarcissisticNumber(num);
        System.out.println(result);

    }
    //创建一个判断是否为水仙花数的方法
    public static boolean isNarcissisticNumber(int num){
        //拆分整数
        int x=num/100;
        int y=num%100/10;
        int z=num%10;
        //返回比较值
        return Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3)==num;
    }
}
