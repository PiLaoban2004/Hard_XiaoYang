package com.heima.Tesk1;

public class Test1Case1 {
    public static void main(String[] args) {
     /* 给定两个字符串，A和B。
        A的旋转操作就是将A最左边的字符移动到最右边。
        例如，若A='abcde’，在移动一次之后结果就是'bcdea',如果在若干次调整操作之后，
        A能变成B, 那么返回True。
        如果不能匹配成功，则返回fa1se*/

        //1.定义两个字符串
        String strA = "abcde";
        String strB = "bcde";

        //2.调用方法进行比较
        boolean result = check(strA, strB);
        System.out.println(result);


    }

    //定义一个比较方法
    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    //定义一个旋转方法
    public static String rotate(String str) {
        //用subString进行截取，把左边的字符截取出来拼接到右侧
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }
}
