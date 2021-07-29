package geek.leetcode.week02;

//https://leetcode-cn.com/problems/corporate-flight-bookings/
//lc1109
//航班预订统计
//差分的前缀和是原始数组，思想：一段加d影响l到r+1处消失
// l位置 +d，r+1位置-d
//前缀和  s[i] = s[i-1]+a[i];
//差分 b[i]=a[i]-a[i-1];则b的前缀和为原数组a，a[i] = a[i-1]+b[i];

public class Lc1109CorpFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
//        n为1~n
        int[] ans = new int[n+2];
        for (int j = 0; j < bookings.length; j++) {
            ans[bookings[j][0]] += bookings[j][2];
            ans[bookings[j][1]+1] -= bookings[j][2];

        }
//         1~n
        int[] a2 = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            a2[i] = a2[i-1] + ans[i];
        }
//        0~n-1
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            a[i-1] = a2[i];
        }
        return a;
    }

}
