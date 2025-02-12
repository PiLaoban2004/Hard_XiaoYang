package com.heima.ArrayList;

import java.util.ArrayList;

/*1,main方法中定义一个集合，存入三个用户对象。
用户属性为：id, username, password
2，要求：定义一个方法，根据id查找对应的用户信息并输出索引
如果存在，返回true
如果不存在，返回false*/
public class Demo5 {
    public static void main(String[] args) {
        //1.main方法中定义一个集合
        ArrayList<User> list = new ArrayList<>();
        //2.创建三个用户对象
        User user1 = new User("1", "张三", "123");
        User user2 = new User("2", "李四", "123");
        User user3 = new User("3", "王五", "123");
        //3.将用户对象添加到集合中
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //4，调用方法，输出结果
        int index = findIndex(list, "1");
        boolean result = findUser(list, "1");
        //5.输出结果
        System.out.println(result);
        System.out.println("索引为："+index);
    }

    public static int findIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean findUser(ArrayList<User> list, String id) {
        return findIndex(list, id)>=0;

    }
}
