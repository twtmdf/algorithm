package geek.leetcode.week01;

//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
//lc26
// 主题思路：保留与上一个不一样的
// 细节判断：i-1不能越界，第0个肯定要
public class Lc26RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        for (int i=0;i<nums.length;i++) {
            if (n==0 || nums[i] != nums[i-1]) {
                nums[n++] = nums[i];
            }
        }
        return n;
    }
}
