package geek.leetcode.week01;

//https://leetcode-cn.com/problems/linked-list-cycle-ii/
//lc142
//head->st=l
//st->meet=p
//meet->st = r-p;
//r为环长
//慢指针走到l+p
//快指针走2步，慢指针走一步 2(l+p) = l+p +k*r
//l = k*r-p = (k-1)*r+(r-p)

public class Lc142DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return head;
            }
        }
        return null;
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
