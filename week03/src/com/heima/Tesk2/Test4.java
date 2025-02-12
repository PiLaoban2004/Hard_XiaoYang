package com.heima.Tesk2;

public class Test4 {
    public static void main(String[] args) {
        /*给你一个字符串s，由若于单词组成，单词前后用一些空格字符隔开。
          返回字符串中最后一个单词的长度。
          单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
          示例 1：输入：s = "Hello World" 输出：5 解释：最后一个单词是“world”，长度为5。
          示例2：输入：s=" fly me to the moon"
          解释：最后一个单词是“moon”，长度为4。
          示例 3：输入：s ="Iuffy is still joyboy"解释：最后一个单词是长度为6的“joyboy”。*/
        String s = "Iuffy is still joyboy";

        System.out.println(lastWordLength(s));

    }

    //定义数最后一个单词的方法
    public static int lastWordLength(String s) {
        //定义一个变量count，用来记录最后一个单词的长度
        int count=0;
        //从字符串的最后一个字符开始遍历
        for (int i = s.length() - 1; i >= 0; i--) {
            //获取当前字符
            char c = s.charAt(i);
            //判断当前字符是否为空格
            if (c==' '){
                break;
            }
            count++;
        }
        return count;
    }
}
