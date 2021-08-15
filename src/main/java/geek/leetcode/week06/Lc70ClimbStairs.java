package geek.leetcode.week06;

//https://leetcode-cn.com/problems/climbing-stairs/
//lc70
public class Lc70ClimbStairs {
    public int climbStairs(int n) {
        int l1 = 0;
        int l2 = 0;
        int l = 1;
        for(int i = 1; i<=n;i++) {
            l1 = l2;
            l2 = l;
            l = l1+l2;
        }
        return l;
    }
}
