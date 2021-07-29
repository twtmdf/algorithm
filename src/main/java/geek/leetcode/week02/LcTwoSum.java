package geek.leetcode.week02;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//https://leetcode-cn.com/problems/two-sum/submissions/
//lc1 两数之和，无序

public class LcTwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Pair> map = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            map.add(new Pair(nums[i],i));
        }
        map = map.stream().sorted(Comparator.comparing(Pair::getLeft)).collect(Collectors.toList());
        Arrays.sort(nums);
        int len = nums.length;
        int j = len - 1;
        for (int i = 0; i < map.size(); i++) {
            if (i > 0 && map.get(i).getLeft() == (map.get(i - 1).getLeft())) {
                continue;
            }
            while (i < j && map.get(i).getLeft() + map.get(j).getLeft() > target) {
                j--;
            }
            if (i < j && map.get(i).getLeft() + map.get(j).getLeft() == target) {
                int[] a =  new int[2];
                a[0] = map.get(i).getRight();
                a[1] = map.get(j).getRight();
                return a;
            }
        }
        return null;
    }
    class Pair{
        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public int getLeft() {
            return left;
        }

        public int getRight() {
            return right;
        }
    }

}
