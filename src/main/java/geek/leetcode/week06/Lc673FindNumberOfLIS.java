package geek.leetcode.week06;

import java.util.Arrays;

//https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/
//lc673 最长递增子序列的个数
public class Lc673FindNumberOfLIS {
    public int findNumberOfLIS(int[] nums) {
        int length = nums.length;
        if (length <= 1) return length;
        int[] lengths = new int[length];
        int[] counts = new int[length];
        Arrays.fill(counts, 1);

        for (int j = 0; j < length; ++j) {
            for (int i = 0; i < j; ++i) if (nums[i] < nums[j]) {
                if (lengths[i] >= lengths[j]) {
                    lengths[j] = lengths[i] + 1;
                    counts[j] = counts[i];
                } else if (lengths[i] + 1 == lengths[j]) {
                    counts[j] += counts[i];
                }
            }
        }
        int longest = 0, ans = 0;
        for (int l: lengths) {
            longest = Math.max(longest, l);
        }
        for (int i = 0; i < length; ++i) {
            if (lengths[i] == longest) {
                ans += counts[i];
            }
        }
        return ans;
    }
}
