package SchoolTesk.Class3.c;

import java.util.Arrays;
import java.util.Comparator;

public class Tesk03 {
    /*任务三:信息管理功能关键算法(30分)
    创建5个学生对象，并赋给一个学生数组，每个学生有以下属性:学号
    姓名、年龄，请按顺序实现以下任务:
    子任务1:将学生按学号排序输出。
    子任务2:给所有学生年龄加1。
    子任务3:在实现子任务2的基础上，统计大于20岁的学生人数。*/
    Student[] arr;

    public Tesk03() {
        // 创建5个学生对象并赋给一个数组
        arr = new Student[]{
                new Student(5, "张三", 18),
                new Student(3, "李四", 19),
                new Student(2, "王五", 20),
                new Student(4, "赵六", 16),
                new Student(1, "孙七", 17)
        };

        // 子任务1: 按学号排序
        Arrays.sort(arr, Comparator.comparingInt(Student::getID));
    }

    // 子任务1: 将学生按学号排序输出
    public void printSortedStudents() {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            System.out.println(student);
        }
    }

    //子任务1:将学生按学号排序输出。
    public void getResult() {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            System.out.println(student);
        }
    }
    //子任务2:给所有学生年龄加1。
    //子任务3:在实现子任务2的基础上，统计大于20岁的学生人数。
    public void returnAgeAndCount() {
       int count=0;
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            student.setAge(student.getAge()+1);
            if (student.getAge()>20){
                count++;
            }
        }
        System.out.println("所有学生的年龄加1后的信息为：");
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            System.out.println(student);
        }
        System.out.println("---------------------------");
        System.out.println("大于20岁的学生有:"+count+"个");
    }

}

