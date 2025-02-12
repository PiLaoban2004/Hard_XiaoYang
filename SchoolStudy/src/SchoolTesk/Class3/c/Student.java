package SchoolTesk.Class3.c;

public class Student {
    //创建5个学生对象，并赋给一个学生数组，每个学生有以下属性:学号、姓名、年龄
    private int ID;
    private String Name;
    private int age;

    public Student() {
    }

    public Student(int ID, String name, int age) {
        this.ID = ID;
        Name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + ID +
                ", name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
