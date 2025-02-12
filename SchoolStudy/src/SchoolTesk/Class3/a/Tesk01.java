package SchoolTesk.Class3.a;

public class Tesk01 {
    /*任务一:学生类关键算法(30分)
    请完成以下编程工作:
            ①定义学生类，其包含2个属性:学号，姓名。
            ②定义大学生类，该类继承于学生类，并新增一个属性:专业。
            ③为大学生类实例化一个对象，并给这个大学生对象的所有属性赋值。
    注意:
    1.所有属性的数据类型均为字符串类型
    2.大学生类应该继承于学生类
    3.在主函数(或主方法)中实例化大学生对象，并给该对象的每个属性赋值。*/
    public static void main(String[] args) {
        //为大学生类实例化一个对象
        Student.CollegeGraduate collegeGraduate= new Student.CollegeGraduate("001","张三","学生");
        System.out.println("学号:"+collegeGraduate.getID());
        System.out.println("姓名:"+collegeGraduate.getName());
        System.out.println("职业:"+collegeGraduate.getMajor());
    }
}
