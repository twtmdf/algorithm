package geek.leetcode.week05;

//https://leetcode-cn.com/problems/koko-eating-bananas/submissions/
public class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 1_000_000_000;
        while (lo< hi) {
            int mi = (lo + hi) /2;
            if(!possible(piles,h,mi)) {
                lo = mi+1;
            }else {
                hi = mi;
            }
        }
        return lo;
    }

    public boolean possible(int[] piles, int h, int k) {
        int time = 0;
        for (int p: piles) {
            time += (p - 1) / k + 1;
        }
        return time <= h;
    }
}
