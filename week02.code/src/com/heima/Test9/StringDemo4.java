package com.heima.Test9;

public class StringDemo4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        String str = arrToString(arr);
        System.out.println(str);
    }
    //1.我要干嘛 ----遍历数组并把数组拼接成一个字符串
    //2.我需要什么 ----数组
    //3.是否要把结果返回给调用处 ----返回一个拼接之后的字符串
    public static String arrToString(int[] arr) {
        if (arr==null){
            return "";
        }
        if (arr.length==0){
            return "[]";
        }

        String result="[";
        for (int i = 0; i < arr.length; i++) {
            //i索引 arr【i】元素
            if (i==arr.length-1){
                result=result+arr[i];
            }else {
                result=result+arr[i]+", ";

            }
        }
        result=result+"]";

        return result;
    }
}
