package com.yzx.algorithm;

public class BinarySearch {
    public BinarySearch() {

    }

 /*   ###  基础版（左闭右闭）
    需求：在**有序**数组 $A$ 内，查找值 $target$
    * 如果找到返回索引
    * 如果找不到返回-1*/
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length - 1;//设置指针和初值
        while (i <= j) { //范围内有东西
            int m = (i + j) >>> 1; //i<=j 它们指向的元素也会参与比较
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
    /*改动版本（左闭右开)*/
    public static int binarySearchAlternative(int[] a, int target) {
        int i = 0, j = a.length;
        while (i < j) {  //j指的是边界 指向的元素一定不是查找的值
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m ;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
