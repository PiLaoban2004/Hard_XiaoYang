package SchoolTesk.Class7.a;

public class Tesk01 {
    /*任务一:小球反弹问题关键算法(30分)
    一个球从 100 米高度自由落下，每次落地后反弹回原高度的一半，再落下，
    再反弹。求它在第十次落地时，共经过多少米?第十次反弹多高?
    注意:使用循环结构语句实现。*/
    public static void main(String[] args) {
        double s=100;//总高度
        double high=100;//第一次高度
        int n=10;//次数
        double d=0;
        for (int i = 0; i < n; i++) {
            s=s+d;
            high= high / 2.0;
            d=high*2;
        }
        System.out.println("共走过:"+s+"米");
        System.out.println("第"+n+"次反弹的高度是："+high);
    }
}
