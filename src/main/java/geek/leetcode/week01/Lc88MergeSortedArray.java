package geek.leetcode.week01;

//https://leetcode-cn.com/problems/merge-sorted-array/
// lc88
// 主题思路：ij两个指针倒着扫描，谁大要谁
// 细节判断：i,j不能越界（一个<0，就要另一个）

public class Lc88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j = n-1,k = m+n-1;
        for (;k>=0;k--) {
            if (j<0 || (i>=0 && nums1[i]>= nums2[j])) nums1[k] = nums1[i--];
            else nums1[k] = nums2[j--];
        }
    }
}
