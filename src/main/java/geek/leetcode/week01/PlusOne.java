package geek.leetcode.week01;
import java.lang.*;
//66
//https://leetcode-cn.com/problems/plus-one/
public class PlusOne {

    public int[] plusOne(int[] digits) {
        String a ="";
        int len = digits.length;
        int val = 1;
        for(int i=len-1;i>=0;i--) {
            if(val != 0) {
                int v = digits[i]+val;
                digits[i] = v%10;
                val = v/10;
            }
            a+=(digits[i]);
        }
        if(val !=0 ){
            a+=(val);
        }
        int[] res = new int[a.length()];
        for(int i =0;i<a.length();i++){
            res[i] = a.charAt(a.length()-i-1)-'0';
        }
        return res;
    }
}
