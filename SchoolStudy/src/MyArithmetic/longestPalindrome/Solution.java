package MyArithmetic.longestPalindrome;

/*好的，以下是一个中等难度的Java算法题目：
    题目：最长回文子串
    问题描述：
    给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
    示例：
    输入: "babad"
    输出: "bab"
    说明: "aba" 也是一个有效的答案。
    输入: "cbbd"
    输出: "bb"
    要求：
    请编写一个Java函数 longestPalindrome(String s)，返回最长回文子串。
    时间复杂度应尽可能低，最好是O(n^2)或更低。
    空间复杂度应尽可能低，最好是O(1)或O(n)。
    你可以使用中心扩展法来解决这个问题，即从字符串的每个字符或每个字符之间的位置开始向两边扩展，找出回文子串。
    也可以使用动态规划来解决这个问题，通过构建一个二维数组来记录子串是否为回文。*/
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            //以当前字符为中心扩展
            int len1 = expandAroundCenter(s, i, i);
            //以当前字符和下一个字符之间为中心扩展
            int len2=expandAroundCenter(s,i,i+1);
            int len=Math.max(len1,len2);
            if (len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
