package com.heima.Tesk2;

public class Test3 {
    public static void main(String[] args) {
        /*给定两个字符串形式表示非负整数num1和num2，返回num1和num2的乘积，
        它们的乘积也表示为字符串形式。*/

        //1.定义两个字符串
        String num1 = "12";
        String num2 = "4";
        //2.调用方法
        int[] a = strToNum(num1);
        int[] b = strToNum(num2);
        int[] result = multiply(a, b);
        //把整数变成字符串
        for (int i = 0; i < result.length; i++) {
            StringBuilder sb=new StringBuilder();
            sb.append(result[i]);
            System.out.print(sb);
        }
    }

    //2.把字符串变成对应的整数
    public static int[] strToNum(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - 48;
        }
        return arr;
    }

    //3.把整数相乘，得到结果
    public static int[] multiply(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length];
        for (int i = num1.length - 1; i >= 0; i--) {
            for (int j = num2.length - 1; j >= 0; j--) {
                result[i + j + 1] += num1[i] * num2[j];
                result[i + j] += result[i + j + 1] / 10;
                result[i + j + 1] %= 10;
            }

        }
        return result;
    }
}

