package geek.leetcode.week02;

//https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
//lc 167 两数之和 II - 输入有序数组
//双指针
public class Lc167TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int j = len - 1;
        int a[] = new int[2];
        for (int i = 0; i < len; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            while (i < j && numbers[i] + numbers[j] > target) {
                j--;
            }
            if (i < j && numbers[i] + numbers[j] == target) {
                a[0] = numbers[i];
                a[1] = numbers[j];
                return a;
            }
        }
        return null;
    }
}
