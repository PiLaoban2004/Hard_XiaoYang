package SchoolTesk.Class9.b;

import java.util.Scanner;

public class Tesk02 {
    /*任务二:副结长度关键算法(30分)
    公司设计的中国节还需要副结(主结周围的结)，副结的长度必须是素数。
    现在公司需要统计出某个范围内哪些数是素数。
    从键盘上输入一个整数N(10<N<100)，输出1~N之间的素数
    注意:用带有一个输入参数的函数(或方法)实现，返回值类型为布尔类型*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数N，(10<N<100)");
        int N = sc.nextInt();
        if (N <= 10 || N >= 100) {
            return;
        }
        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    //判断是否为素数 如果只能被1和它本身整除，那么这个数就是素数
    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
