package SchoolTesk.Class1;

public class Tesk02 {
    /*任务二:乘法口诀助记功能关键算法(30分)
    选择乘法口诀助记功能，输出阶梯形式的9*9乘法口诀表
    注意:使用循环结构语句实现。*/
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
