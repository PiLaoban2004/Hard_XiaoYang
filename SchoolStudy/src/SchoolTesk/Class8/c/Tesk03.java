package SchoolTesk.Class8.c;

public class Tesk03 {
    /* 任务三:统计同构数关键算法(30分)
    编写程序输出2~99之间的同构数。同构数是该数正好和该数平方的尾数相等
    例如5的平方为 25，25 的平方为 625，则 5、25 都为同构数。*/

    public static void main(String[] args) {
        System.out.println("同构数及其平方：");
        // 使用一个循环检查 2 到 99 之间的每个数字
        for (int i = 2; i < 100; i++) {
            if (i <= 9) {
                if (i == Math.pow(i, 2) % 10) {
                    System.out.println(i + " 是同构数，平方为 " + Math.pow(i, 2));
                }
            } else {
                // 检查平方的两位几位与自身相等
                if (Math.pow(i,2)%100== i) { // 当 i 与其平方的最后两位相等
                    System.out.println(i + " 是同构数，平方为 " + Math.pow(i,2));
                }
            }

        }
    }
}
