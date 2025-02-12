package com.heima.Test5;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Phone[] arr=new Phone[3];

        //2.创建手机的对象
        Phone p1=new Phone("XIAOMI",1999,"white");
        Phone p2=new Phone("HUAWEI",2999,"yellow");
        Phone p3=new Phone("IPONE15",7999,"green");

        //3.添加到数组
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;

        //4.获取三部手机的平均价格
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone=arr[i];
            sum+=phone.getPrice();

        }
        //5.求平均值
        int avg=sum/arr.length;
        System.out.println(avg);
    }
}
