package geek.leetcode.week05;

//https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/submissions/
public class ShipWithinDays {
    public int shipWithinDays(int[] weights, int days) {
        int lo =1;
        int hi = 25_000_000;
        while(lo < hi) {
            int mi = (lo +hi)/2;
            if(!possible(weights,days,mi)) {
                lo = mi +1;
            }else {
                hi = mi;
            }
        }
        return lo;
    }

    public boolean possible(int[] weights,int days,int k) {
        int total = 0;
        int t = 0;
        for (int p: weights) {
            if(k<p) return false;
            if(t+p<k) {
                t+=p;
            }else {
                total+=1;
                if(t+p == k) {
                    t =0;
                }else {
                    t = p;
                }
            }
        }
        if(t >0) total+=1;
        return total <= days;
    }
}
