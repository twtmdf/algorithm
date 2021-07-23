package geek.leetcode.week01;

//https://leetcode-cn.com/problems/move-zeroes/submissions/
//lc283
public class Lc283MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int len = nums.length;
        // 主题思路：保留非零值
        for (int i=0;i<len;i++) {
            if (nums[i] != 0) nums[zero++]=nums[i];
        }
        // 按题目要求，最后面填充零
        while (zero<len) {
            nums[zero++] = 0;
        }
    }
}
