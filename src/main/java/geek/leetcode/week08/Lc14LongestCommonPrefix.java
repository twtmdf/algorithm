package geek.leetcode.week08;

import java.util.Arrays;

//https://leetcode-cn.com/problems/longest-common-prefix/description/
//lc 14 最长公共前缀
public class Lc14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String min = strs[0];
        for (int i=1;i<strs.length;i++) {
            int length = min.length() < strs[i].length()?min.length():strs[i].length();
            int j = 0;
            while (j<length && min.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            min = min.substring(0,j);
        }
        return min;
    }
}
