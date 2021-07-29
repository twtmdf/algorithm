package geek.leetcode.week01;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/count-number-of-nice-subarrays/
//lc1248
//最优美子数组
//1 <= nums.length <= 50000
//        1 <= nums[i] <= 10^5
//        1 <= k <= nums.length
public class Lc1248NumberOfSubarrays {

    public int numberOfSubarrays(int[] nums, int k) {
        int total = 0;
//        数组为0~n-1下标，前缀和长度为0~n
        int len = nums.length;
        int[] s = new int[len+1];
        int[] count = new int[len+1];
        for (int i = 0; i < nums.length; i++) {
            s[i+1] = s[i +1 - 1] + nums[i]%2;
        }
//        在一个数组s中统计等于某个数的数量
//        长度为n的计数数组count
//        s = [0,1,2,2,3,3,4]
//        count = [1,1,2,3,1]
//        1个0，1个1，2个2，3个3，1个4
//        for i = 0~n
//            已转换为0，1,且提示有：1 <= nums.length <= 50000
        for (int i = 0; i < s.length; i++) {
            count[s[i]] += 1;
        }
//        求i>j且s[i]-s[j]=k的个数，则s[j] = s[i]-k
//        for i= 1~n，s[0]为初始化的0
        for (int i = 1; i < s.length; i++) {
            if (s[i]-k>=0) {
                total += count[s[i] - k];
            }
        }
        return total;
    }


//    public int numberOfSubarrays(int[] nums, int k) {
//        int total = 0;
//        int len = nums.length;
////        数组为0~n-1下标，前缀和长度为0~n
//        int[] s = new int[len+1];
//        int[] count = new int[len+1];
//        // s[0] =0;for循环s的下标从1开始加
//        count[s[0]]++;
//        for (int i = 0; i < nums.length; i++) {
//            s[i+1] = s[i + 1 -1] + nums[i]%2;
//            count[s[i+1]]++;
//        }
//        for (int i = 1; i < s.length; i++) {
//            if (s[i]-k>=0) {
//                total += count[s[i] - k];
//            }
//        }
//        return total;
//    }
}
