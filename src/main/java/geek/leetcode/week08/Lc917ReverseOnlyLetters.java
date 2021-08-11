package geek.leetcode.week08;

//https://leetcode-cn.com/problems/reverse-only-letters/
//lc917 紧翻转字母
public class Lc917ReverseOnlyLetters {
    public String reverseOnlyLetters(String ss) {
        char[] s = ss.toCharArray();
        if(s.length>1) {
            char temp;
            int i = 0;
            int j = s.length-1;
            while (i<j) {
                boolean ai = s[i]>='a' && s[i]<='z' || s[i]>='A' && s[i]<='Z';
                boolean aj = s[j]>='a' && s[j]<='z' || s[j]>='A' && s[j]<='Z';
                if (ai && aj) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    i++;j--;
                }else {
                    if (!ai) i++;
                    if (!aj) j--;
                }
            }
        }
        return String.valueOf(s);
    }
}
