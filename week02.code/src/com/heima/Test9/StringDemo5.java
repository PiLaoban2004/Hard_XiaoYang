package com.heima.Test9;

public class StringDemo5 {
    public static void main(String[] args) {
        String result = reverse("abcdefg");
        System.out.println(result);
    }

    //1.我要干嘛 ----字符串的反转
    //2.我干这件事情需要什么-----需要一个字符串
    //3.调用处是否需要继续使用方法的结果----需要结果进行输出
    public static String reverse(String str) {
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            result=result+c;
        }
        return  result;
    }

}
