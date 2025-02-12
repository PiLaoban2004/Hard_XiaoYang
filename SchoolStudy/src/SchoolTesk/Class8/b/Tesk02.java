package SchoolTesk.Class8.b;

public class Tesk02 {
    /*任务二:统计纸片对折关键算法(30分)
    假设一张足够大的纸，纸张的厚度为0.5毫米。请问对折多少次以后，可
    以达到珠穆朗玛峰的高度(最新数据:8844.43米)。请编写程序输出对折次数。*/
    public static void main(String[] args) {
        //计数器
        int count=0;
        double thickness=0.5;
        double height=8844.33;
        while (true) {
            if (thickness*2>=height){
                break;
            }
            thickness*=2;
            count++;
        }
        System.out.println("对折次数:"+count);
    }
}
