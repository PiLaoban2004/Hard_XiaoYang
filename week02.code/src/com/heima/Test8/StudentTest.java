package com.heima.Test8;

import com.heima.Test7.Student;

/*要求3：通过id删除学生信息
如果存在，则删除，如果不存在，则提示删除失败。
要求4：删除完毕之后，遍历所有学生信息。
*/
public class StudentTest {
    public static void main(String[] args) {
        //1.创建一个长度为3的Student数组
        Student[] arr = new Student[3];

        //2.创建三个学生对象，并赋值给数组中的元素
        Student stu1 = new Student(1, "zhangsan", 18);
        Student stu2 = new Student(2, "lisi", 20);
        Student stu3 = new Student(3, "wangwu", 19);

        //3.将学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        /*要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。*/
        int index = getIndex(arr, 4);
        if (index >= 0) {
            arr[index] = null;
            //要求4：删除完毕之后，遍历所有学生信息。
            printArr(arr);
        } else {
            System.out.println("删除失败");
        }
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //非空判断
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        //当循环结束之后，还没找到就不存在
        return -1;
    }

    //要求2：遍历数组，输出数组中的每一个学生对象
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());

            }
        }
    }
}

