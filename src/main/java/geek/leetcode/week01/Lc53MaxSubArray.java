package geek.leetcode.week01;

//https://leetcode-cn.com/problems/maximum-subarray/
//lc53 最大子序和
//前缀和，前缀和最小值
public class Lc53MaxSubArray {
    public int maxSubArray(int[] nums) {
        Long max =  Long.MIN_VALUE;
        int len = nums.length;
        long[] s = new long[len+1];
        int i =1;
//        前缀和
        for (; i <= nums.length; i++) {
            s[i] = s[i-1] + nums[i-1];
        }
//        long[] pre = new long[len+1];
//        pre[0] = s[0];
        long preMin = s[0];
//        前缀最小值
//        for (i = 1;i<len+1;i++) {
//            pre[i] = Math.min(pre[i-1],s[i]);
//        }
//        i之前的j->j<=i-1
        for (i =1;i<len+1;i++) {
//            max =  Math.max(max,s[i]-pre[i-1]);
            max =  Math.max(max,s[i]-preMin);
            preMin = Math.min(preMin,s[i]);
        }
        return max.intValue();
    }
}
