package geek.leetcode.week04;

public class Lc154FindMin {
    public int findMin(int[] nums) {
        int l=0,r = nums.length -1;
        while (l<r) {
            int mid = (l+r-1) /2;
            if (nums[mid] < nums[r]) r = mid;
            else if(nums[mid] > nums[r]) l = mid +1;
            else r-=1;
        }
        return nums[l];
    }

}
