package com.yzx.MyStatic.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.3, 4.5, 3.2, 5.4, 2.2};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
