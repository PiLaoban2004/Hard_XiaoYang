package SchoolTesk.Class5.a;

public class Tesk01 {
   /* 任务一
    评分计算功能关键算法(30分
    编写一个应用程序，计算并输出一堆数组
    (9.8，12，45，67，23，1.98，2.55，45)中的最大值、最小值和平均值。
    */
   public static void main(String[] args) {
       double[] arr={9.8,12,45,67,23,1.98,2.55,45};
       double max = getMax(arr);
       System.out.println(max);

       double min = getMin(arr);
       System.out.println(min);

       double ave=getAverage(arr);
       System.out.println(ave);
   }
   //创建一个求最大值的方法
    public static double getMax(double[] arr){
       double max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }
    //创建一个求最小值的方法
    public static double getMin(double[] arr){
        double min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];

            }
        }
        return min;
    }
    //创建一个求平均值的方法
    public static double getAverage(double[] arr){
       double sum=0;
        for (int i = 0; i < arr.length; i++) {
            double v = arr[i];
            sum=sum+arr[i];
        }
        double average=sum/arr.length;
       return average;
    }
}
