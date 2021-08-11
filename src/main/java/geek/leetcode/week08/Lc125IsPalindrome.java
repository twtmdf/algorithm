package geek.leetcode.week08;

//lc125 验证回文
public class Lc125IsPalindrome {
    public boolean isPalindrome(String ss) {
        boolean isPalindrome = true;
        char[] s = ss.toCharArray();
        if(s.length>1) {
            char temp;
            int i = 0;
            int j = s.length-1;
            while (i<j) {
                boolean ai = s[i]>='a' && s[i]<='z' || s[i]>='A' && s[i]<='Z' || s[i] >='0' && s[i] <='9';
                boolean aj = s[j]>='a' && s[j]<='z' || s[j]>='A' && s[j]<='Z' || s[j] >='0' && s[j] <='9';
                if (ai && aj) {
                    if(Character.toLowerCase(s[i]) == Character.toLowerCase(s[j])) {
                        i++;j--;
                    }else{
                        isPalindrome = false;
                        break;
                    }
                }else {
                    if (!ai) i++;
                    if (!aj) j--;
                }
            }
        }
        return isPalindrome;
    }
}
