package com.heima.Test6;

public class GirlFriendsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        GirlFriends[] arr=new GirlFriends[4];

        //2.创建对象
        GirlFriends gf1=new GirlFriends("小欣",18,"女","羽毛球");
        GirlFriends gf2=new GirlFriends("小芳",22,"女","篮球");
        GirlFriends gf3=new GirlFriends("小宇",25,"女","唱歌");
        GirlFriends gf4=new GirlFriends("小晴",17,"女","跳舞");

        //3.添加到数组
        arr[0]=gf1;
        arr[1]=gf2;
        arr[2]=gf3;
        arr[3]=gf4;

        //4.计算年龄
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriends gf=arr[i];
            sum+=gf.getAge();
        }
        //5.计算平均年龄
        int avg=sum/arr.length;
        System.out.println("平均年龄为："+avg);

        //6.统计年龄比平均值低的有几个并打印她们的信息
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriends gf=arr[i];
            if (arr[i].getAge()<avg){
                count++;
                System.out.println(gf.getName()+","+gf.getAge()+","+gf.getGender()+","+gf.getHobby());

            }
        }
        System.out.println("有"+count+"个");
    }
}
