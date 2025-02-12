package SchoolTesk.Class2;

public class Tesk01 {
    /*已知字符串数组 A，包含初始数据:al,a2,a3,a4,a5;字符串数组B，包
    含初始数据:b1,b2,b3,b4,b5。编写程序将数组A、B的每一对应数据项相连接
    然后存入字符串数组C，并输出数组C。输出结果为:
    a1b1,a2b2,a3b3,a4b4,a5b5
    注意:定义2个字符串数组A、B，用于存储初始数据。定义数组C，用于
    输出结果。
    1.使用循环将数组A、B的对应项相连接，结果存入数组C。(不要边连接
    边输出)
    2.使用循环将数组C中的值按顺序输出。*/
    public static void main(String[] args) {
        //定义2个字符串数组A、B，用于存储初始数据
        String[] arrA = {"a1", "a2", "a3", "a4" };
        String[] arrB={"b1","b2","b3","b4"};
        // 创建一个新的字符串数组来存储连接后的结果
        String[] arrC=new String[arrA.length];

        //使用循环将数组A、B的对应项相连接，结果存入数组C。
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i] + arrB[i];
            System.out.println(arrC[i]);
        }
    }
}
