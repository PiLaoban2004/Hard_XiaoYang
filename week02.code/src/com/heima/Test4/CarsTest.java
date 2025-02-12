package com.heima.Test4;

import java.util.Scanner;

public class CarsTest {
    public static void main(String[] args) {
        //1.创建一个汽车对象数组，数组长度为3
        Cars[] arr = new Cars[3];

        //2.创建三个汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Cars c = new Cars();
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            c.setColor(color);

            //3.将汽车对象存入数组
            arr[i] = c;
        }
        //4.遍历数组，输出汽车信息
        for (int i = 0; i < arr.length; i++) {
            Cars cars=arr[i];
            System.out.println(cars.getBrand()+","+cars.getPrice()+","+cars.getColor());
        }
    }
}
