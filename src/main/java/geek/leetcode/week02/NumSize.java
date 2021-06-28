package geek.leetcode.week02;

import java.util.HashMap;
import java.util.Map;

//https://leetcode-cn.com/problems/degree-of-an-array/
public class NumSize {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,StartEnd> kv = new HashMap<Integer,StartEnd>();
        int max = 0;
        int i =0;
        int minSize =0;
        for (int n:nums) {
            StartEnd startEnd = kv.get(n);
            int times = 0;
            int size =0;
            int start =0;
            if (null == startEnd) {
                times =1;
                size = 1;
                start = i;
            }else {
                times=startEnd.getTimes()+1;
                size = i-startEnd.getStart()+1;
                start = startEnd.getStart();
            }
            kv.put(n,new StartEnd(start,times,size));
            if(times>max){
                max = times;
                minSize=size;
            }else if(times == max) {
                if(size<minSize){
                    minSize = size;
                }
            }
            i++;
        }
        return minSize;
    }
    class StartEnd {
        private int start;
        private int times;
        private int size;

        public StartEnd(int start, int times,int size) {
            this.start = start;
            this.size = size;
            this.times = times;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
