package SchoolTesk.Class2;

import java.util.Scanner;

public class Tesk03 {
    /* 任务三:趣味英语试题3关键算法(30分)
     编写一个程序实现统计一串字符串中的英文小写字母个数!
     例如:输入“axZvnNg0uyi”，
     得到的值应该是8:
     注意:使用分支语句实现，且有输入输出，直接输出不计分*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串,回车结束");
        String str = sc.nextLine();
        int result = CountNum(str);
        System.out.println(str+"里面的小写字母个数一共有"+result);

    }

    //创建一个统计英文小写字母个数的方法
    public static int CountNum(String str) {
        //定义一个计数器
        int count = 0;
        //遍历数组
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        return count;
    }
}
