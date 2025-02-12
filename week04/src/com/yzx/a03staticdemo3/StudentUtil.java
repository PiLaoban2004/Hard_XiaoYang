package com.yzx.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    //私有化构造
    private StudentUtil() {

    }
    public static int getMax(ArrayList<Student> list){
        //定义一个参照物
        int max=list.get(0).getAge();

        //循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if (age>max){
                max=age;
            }
        }
        return max;
    }
}
