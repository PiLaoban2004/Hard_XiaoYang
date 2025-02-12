package SchoolTesk.Class5.c;

import java.util.Scanner;

public class Tesk03 {
    /*交税计算功能关键算法(30分
      某国的个人所得税草案规定，个税的起征点为3000元，分成7级，税率情
      况见下表，从键盘上输入月工资，计算应交纳的个人所得税。
      注意:超出部分按所在税的级数计算，如:一个人的月收入为6000，应交
      个人所得税为:1500*0.05+((6000-3000)-1500)*0.1=225
      请在键盘上输入一个人的月收入，编程实现计算该公民所要交的税
      如:输入“6000”，则输出“你要交的税为:225*/

    public static void main(String[] args) {
        //键盘上输入月工资
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的月收入");
        float salary = sc.nextFloat();

        //减去起征点3000元
        float taxSalary = salary - 3000;
        float tax = 0;
        if (taxSalary < 0) {
            System.out.println("不用交税");
        } else if (taxSalary >= 0 && taxSalary <= 1500) {
            //第一档税
            tax = taxSalary * 0.05f;
        } else if (taxSalary > 1500 && taxSalary <= 4500) {
            //第二档
            tax = 1500 * 0.05f + (taxSalary - 1500) * 0.1f;
        } else if (taxSalary > 4500 && taxSalary <= 9000) {
            //第三档
            tax = 1500 * 0.05f + 4500 * 0.1f + (taxSalary - 4500) * 0.2f;
        } else if (taxSalary > 9000 && taxSalary <= 35000) {
            //第四档
            tax = 1500 * 0.05f + 4500 * 0.1f + 9000 * 0.2f + (taxSalary - 9000) * 0.25f;
        } else if (taxSalary > 35000 && taxSalary <= 55000) {
            //第五档
            tax = 1500 * 0.05f + 4500 * 0.1f + 9000 * 0.2f + 35000 * 0.25f + (taxSalary - 35000) * 0.3f;
        } else if (taxSalary > 55000 && taxSalary <= 80000) {
            //第六档
            tax = 1500 * 0.05f + 4500 * 0.1f + 9000 * 0.2f + 35000 * 0.25f + 55000 * 0.3f + (taxSalary - 55000) * 0.35f;
        } else if (taxSalary > 80000) {
            tax = 1500 * 0.05f + 4500 * 0.1f + 9000 * 0.2f + 35000 * 0.25f + 55000 * 0.3f + 55000 * 0.35f + (taxSalary - 80000) * 0.45f;
        }
        System.out.println("你要交的税为:"+tax);
    }


}
