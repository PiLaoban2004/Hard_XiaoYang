package SchoolTesk.Class3.b;

import java.util.ArrayList;
import java.util.Scanner;

public class Tesk02b {
    /*任务二:成绩等级计算关键算法(30分)
    输入一批学生成绩，以-1作为结束标记。
    统计这批学生中，不及格(score<60)、及格(60<=score<70)、中等(70<=score<80)、良好
    (80<=score<90)、优秀(90<=score<=100)的人数。
    注意:使用分支、循环结构语句实现。
    */
    ArrayList<Integer> list;
    Scanner sc;
    int score;
    int failed = 0, pass = 0, medium = 0, good = 0, excellent = 0;
    public Tesk02b() {
        list=new ArrayList<>();
        if (this.sc == null) {
            this.sc = new Scanner(System.in);
        }
        System.out.println("请输入成绩，空格隔开或者回车隔开,-1结束");
        while (true) {
            score=sc.nextInt();
            //进行-1判断
            if (score==-1){
                break;
            }
            list.add(score);
        }
        //定义一个计数器
        for (int score:list) {
            if (score <= 60) {
                failed++;
            }else if (score >= 60 && score <= 70) {
                pass++;
            }else if (score >= 70 && score <= 80) {
                medium++;
            }else if (score >= 80 && score <= 90) {
                good++;
            }else if (score >= 90 && score <= 100){
                excellent++;
            }

    }
        System.out.println("这些学生成绩中，不及格的有：" + failed + "及格的有：" + pass);
        System.out.println("中等的有：" + medium + "良好 的有：" + good);
        System.out.println("优秀 的有：" + excellent);
    }

}
