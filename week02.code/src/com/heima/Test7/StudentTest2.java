package com.heima.Test7;

/*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求2：添加完毕之后，遍历所有学生信息*/
public class StudentTest2 {
    public static void main(String[] args) {
        //1.创建一个长度为3的数组
        Student[] arr = new Student[3];
        //2.学生对象
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 19);
        Student stu3 = new Student(3, "王五", 20);
        //3.把学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //4.再次添加一个学生对象
        Student stu4 = new Student(4, "赵六", 21);
        //5.唯一性判断
        Boolean flag = contain(arr, stu4.getId());
        //5.1已存在 ----提示重复
        //5.2不存在 ----添加学生对象
        if (flag) {
            System.out.println("学号重复");
        } else {
            //不存在，将学生对象添加到数组中
            //把s4添加到数组中
            //1.数组已经存满，新建一个数组，新数组的长度=老数组长度+1
            //2.数组没有存满，直接存入
            int count = getCount(arr);
            if (count == arr.length) {
                //已经存满
                //新建一个数组，新数组的长度=老数组长度+1
                //然后把老数组的元素，拷贝到新数组当中
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息;
                printArr(newArr);

            }else {
                //没有存满
                arr[count] = stu4;
                printArr(arr);
            }

        }

    }
    //创建一个方法，打印学生信息
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null)
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
        }
    }
    //新建一个数组，新数组的长度=老数组长度+1
    //然后把老数组的元素，拷贝到新数组当中
    public static Student[] creatNewArr(Student[] arr) {
        //1.数组已经存满，新建一个数组，新数组的长度=老数组长度+1
        Student newArr[] = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //定义一个方法判断数组已经存了几个元素
    public static int getCount(Student[] arr) {
        //定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean contain(Student[] arr, int id) {
        //依次获取每一个学生对象
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }

        }
        return false;
    }
}
