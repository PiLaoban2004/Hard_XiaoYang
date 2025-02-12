package SchoolTesk.Class4.c;

public class Tesk03 {
   /* 任务三:图形面积计算关键算法(30分)
    编写程序实现:
            ①定义一个抽象类 Shape，它有一个计算面积的抽象方法 calArea。
            ②定义一个三角形类 Triangle。它有两个属性n、m，分别表示三角形的底
    和高。另外，它必须继承于 Shape 类，并实现calArea 方法来计算三角形的面
    积。
            ③定义一个矩形类 Rectangle。'
    它有两个属性n、m，分别表示矩形的长和
    宽。另外，它必须继承于Shape 类，并实现calArea方法来计算矩形的面积。
            ④定义一个圆类 Circle。它有一个属性r，表示圆形的半径。另外，它必
    须继承于 Shape 类，并实现calArea方法来计算圆形的面积。
            ⑤分别创建一个三角形对象、一个矩形对象、一个圆形对象，然后将它们
    存入到一个数组中，最后将数组中各类图形的面积输出到屏幕上*/

    public Tesk03() {
        /*    分别创建一个三角形对象、一个矩形对象、一个圆形对象，然后将它们
    存入到一个数组中，最后将数组中各类图形的面积输出到屏幕上*/
        //创建一个三角形对象、一个矩形对象、一个圆形对象，然后将它们存入到一个数组中
        Shape[] shape=new Shape[3];
        shape[0]=new Triangle(3,5);
        shape[1]=new Rectangle(3,5);
        shape[2]=new Circle(3);
        //数组中各类图形的面积输出
        //遍历数组并输出
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].calArea());
        }
    }

    //①定义一个抽象类 Shape
   abstract class Shape {
        //它有一个计算面积的抽象方法 calArea。
        public abstract float calArea() ;

    }

    //定义一个三角形类 Triangle，它必须继承于 Shape 类
    class Triangle extends Shape {
        float n;
        float m;
        public Triangle(float n,float m){
            this.n=n;
            this.m=m;
        }
        @Override
        public float calArea() {
            float s=0;
            s=(m*n)/2;
            return s;
        }
    }
    /* 定义一个矩形类 Rectangle。'
     它有两个属性n、m，分别表示矩形的长和宽。
     另外，它必须继承于Shape 类，并实现calArea方法来计算矩形的面积。*/
    class Rectangle extends Shape {
        float n;
        float m;
        public Rectangle(float n,float m) {
            this.n=n;
            this.m=m;
        }

        @Override
        public float calArea() {
            float s=0;
            s=m*n;
            return s;
        }
    }

    /*定义一个圆类 Circle。它有一个属性r，表示圆形的半径。另外，它必
      须继承于 Shape 类，并实现calArea方法来计算圆形的面积。*/
    class Circle extends Shape {
        float r;
        final float PI=3.14f;
        public Circle(float r) {
            this.r=r;

        }

        @Override
        public float calArea() {
            float s=0;
            s=PI*r*r;
            return s;
        }
    }
}
