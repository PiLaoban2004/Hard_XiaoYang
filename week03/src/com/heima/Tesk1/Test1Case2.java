package com.heima.Tesk1;

public class Test1Case2 {
    public static void main(String[] args) {
     /* 给定两个字符串，A和B。
        A的旋转操作就是将A最左边的字符移动到最右边。
        例如，若A='abcde’，在移动一次之后结果就是'bcdea',如果在若干次调整操作之后，
        A能变成B, 那么返回True。
        如果不能匹配成功，则返回fa1se*/

        //1.定义两个字符串
        String strA = "abcde";
        String strB = "bcdea";

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
        //可以把字符串先变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串
        char[] arr = str.toCharArray();
        //拿到0 索引的值
        char first = arr[0];
        //把剩余字符依次往前挪一位
        for (int i = 1; i < str.length(); i++) {
            arr[i-1]=arr[i];
        }
        //把0索引的值放到最后
        arr[arr.length-1]=first;

        //利用字符数组创建一个字符串
        String result = new String(arr);
        return result;
    }

}
