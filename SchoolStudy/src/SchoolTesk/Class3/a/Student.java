package SchoolTesk.Class3.a;

public class Student {
    /* ①定义学生类，其包含2个属性:学号，姓名。
       ②定义大学生类，该类继承于学生类，并新增一个属性:专业。
       ③为大学生类实例化一个对象，并给这个大学生对象的所有属性赋值。*/
    private String ID;
    private String Name;

    public Student() {
    }

    public Student(String ID, String name) {
        this.ID = ID;
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static class CollegeGraduate extends Student{
        private String major;

        public CollegeGraduate(String major) {
            this.major = major;
        }

        public CollegeGraduate(String ID, String name, String major) {
            super(ID, name);
            this.major = major;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }
    }

}
