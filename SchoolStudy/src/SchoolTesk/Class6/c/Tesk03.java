package SchoolTesk.Class6.c;

import java.util.Scanner;

public class Tesk03 {
    /*任务三:回文数检测关键算法(30分)
    输入一个5位正整数，输出它是不是回文数。回文数是这样一种数，它的
    逆序数和它本身相等。例如，12321的逆序数是12321，和它本身相等，所以它
    是回文数。又例如25128的逆序数是82152，所以它不是回文数。
    注意:使用分支或循环结构语句实现。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        int m = 0;
        while (true) {
            System.out.println("请输入一个5位正整数");
            m = sc.nextInt();
            String str = Integer.toString(m);
            if (str.length()!=5){
                System.out.println("输入有误,请重新输入");
            }else {
                break;
            }
        }
        int[] arr = splitNum(m);
        boolean result = isTrue(arr);
        System.out.println(result);
    }

    //定义一个拆分整数的方法
    private static int[] splitNum(int num) {
        //将一个整数拆分成一个长度为5的数组
        int[] arr = new int[5];
        //从个位开始，将num的每一位拆分成数组中的一个元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num % 10;
            num = num / 10;
        }
        return arr;
    }

    //定义一个判断是否为回文数的方法
    public static boolean isTrue(int[] arr) {
        //遍历数组的前半部分
        for (int i = 0; i < arr.length / 2; i++) {
            //如果前半部分的元素与后半部分的对应元素不相等
            if (arr[i] != arr[arr.length - 1 - i]) {
                //则返回false
                return false;
            }
        }
        //否则返回true
        return true;
    }
}
