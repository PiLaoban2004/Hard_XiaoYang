package com.heima.Test7;
/*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求2：添加完毕之后，遍历所有学生信息。
要求3：通过id删除学生信息
如果存在，则删除，如果不存在，则提示删除失败。
要求4：删除完毕之后，遍历所有学生信息。
要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/
public class StudentTest {
    public static void main(String[] args) {
        //1.创建一个长度为3的Student数组
        Student[] arr = new Student[3];

        //2.创建三个学生对象，并赋值给数组中的元素
        Student s1 = new Student(001, "zhangsan", 18);
        Student s2 = new Student(002, "lisi", 20);
        Student s3 = new Student(003, "wangwu", 19);

        //3.将学生对象添加到数组中
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student s4 = new Student(004, "zhaoliu", 21);

        //唯一性判断
        //已存在，不添加
        //不存在，将学生对象添加到数组中
        boolean flag = contain(arr, s4.getId());
        if (flag) {
            //已存在，不添加
            System.out.println("当前id重复，请修改id后再进行添加");
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
                //把s4添加到新数组中
                newArr[count] = s4;


                //要求2：遍历数组，输出数组中的每一个学生对象
                printArr(newArr);
            } else {
                //没有存满
                arr[count] = s4;
                //要求2：遍历数组，输出数组中的每一个学生对象
                printArr(arr);
            }
        }
    }

    //新建一个数组，新数组的长度=老数组长度+1
    //然后把老数组的元素，拷贝到新数组当中
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //把新数组返回
        return newArr;
    }

    //定义一个方法判断数组已经存了几个元素
    public static int getCount(Student[] arr) {
        //定义一个计数器来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        //当循环结束后，就知道数组中有几个元素
        return count;
    }

    //1.我要干嘛？  唯一性判断
    //2.我干这件事，需要什么才能完成？  数组，id
    //3.调用处是否需要继续使用方法的结果  必须返回
    public static boolean contain(Student[] arr, int id) {
        //依次获取每一个学生对象
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                //获取数组中学生对象的id
                int sid = stu.getId();
                //比较id
                if (sid == id) {
                    return true;
                }
            }

        }
        //当循环结束后
        return false;
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
