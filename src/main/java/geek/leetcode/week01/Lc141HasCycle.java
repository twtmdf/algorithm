package geek.leetcode.week01;

//https://leetcode-cn.com/problems/linked-list-cycle/
//lc141
//思路：快指针一次走两步，慢指针一次走一步，有环一定会相遇，且在环的入口的下一个节点相遇
public class Lc141HasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;
            if (fast == head) return true;
        }
        return false;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
