package SchoolTesk.Class2;

import java.util.Scanner;

public class Tesk02 {
   /* 判断一个字符串是否是对称字符串，例如"abc"不是对称字符串
   "aba"、"abba”、"mnanm"是对称字符串。是的话输出”Yes”否则输出”No*/
   public static void main(String[] args) {
       //键盘录入
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入一个字符串");
       String str = sc.next();

       boolean isOK=true;
       //循环遍历并判断
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i)!=str.charAt(str.length()-1-i)){
               isOK=false;
               break;
           }
       }
       if (isOK){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
   }
}
