package com.heima.Test10;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        //1.定义一个int数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //2.调用方法把数组变成字符串
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
    StringBuilder sb=new StringBuilder();
    sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
