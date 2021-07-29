package geek.leetcode.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/3sum/
//lc15 三数之和
public class Lc15ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i=0;i<len;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> all_two_sums = towSum(nums, i + 1, 0-nums[i]);
            for (List<Integer> jk : all_two_sums) {
                jk.add(nums[i]);
                ans.add(jk);
            }
        }
        return ans;
    }
    private List<List<Integer>> towSum(int[] nums,int start,int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        int j = len - 1;
        for (int i = start; i < len; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            while (i < j && nums[i] + nums[j] > target) {
                j--;
            }
            if (i < j && nums[i] + nums[j] == target) {
                List<Integer> a = new ArrayList<>();
                a.add(nums[i]);
                a.add(nums[j]);
                ans.add(a);
            }
        }
        return ans;
    }
}
