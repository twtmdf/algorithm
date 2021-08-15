package geek.leetcode.week04;

import java.util.PriorityQueue;

//https://leetcode-cn.com/problems/find-median-from-data-stream/
//lc295
//数据流中位数
public class Lc295MedianFinder {
    /** initialize your data structure here. */
    private PriorityQueue<Integer> large;
    private PriorityQueue<Integer> small;

    public Lc295MedianFinder() {
        large = new PriorityQueue<>();
        small = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
    }

    public void addNum(int num) {
        if (small.size() >= large.size()) {
            small.offer(num);
            large.offer(small.poll());
        } else {
            large.offer(num);
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if (large.size() < small.size()) {
            return small.peek();
        } else if (large.size() > small.size()) {
            return large.peek();
        }
        return (large.peek() + small.peek()) / 2.0;
    }
}
