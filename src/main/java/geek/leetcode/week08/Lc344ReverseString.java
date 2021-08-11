package geek.leetcode.week08;

import java.util.Arrays;

//https://leetcode-cn.com/problems/reverse-string/
//lc344 翻转数组
public class Lc344ReverseString {
    public void reverseString(char[] s) {
        if(s.length>1) {
            char temp;
            int i = 0;
            int j = s.length-1;
            while (i<j) {
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;j--;
            }
        }
    }

}
