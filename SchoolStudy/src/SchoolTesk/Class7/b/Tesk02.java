package SchoolTesk.Class7.b;

public class Tesk02 {
    /*任务二:停电停多久问题关键算法(30分)
        Lee的老家住在工业区，日耗电量非常大。
        政府要在7、8月对该区进行拉闸限电。政府决定从7月1日起停电，然后
        隔一天到7月3日再停电，再隔两天到7月6日停电，依次下去，每次都比上
        一次长一天。
        Lee 想知道自己家会在哪些日期停电，一共会停多少天的电。请编写程序
        帮他算一算。
        注意:日期限定在7、8月份，在屏幕上输出停电的日期和天数*/
    public static void main(String[] args) {
        int on=0;
        int off=0;
        while ((on+off<=62)){
            off++;
            on=on+off;
            System.out.println(getDay(on));
        }
        System.out.println("共停电"+off+"次");
    }
    //定义一个计算天数的方法
    public static String getDay(int day){
        String data="";
        if (day<=31){
            data="7月"+day+"日";
        }else {
            data="8月"+day%31+"日";
        }
        return data;
    }
}
