package geek.leetcode.week01;

//https://leetcode-cn.com/problems/reverse-linked-list/submissions/
//lc206
// 1->2
// last =null;
// nextHead = 2;
// 1->null;
// last = 1;
// head = nextHead;
public class Lc206ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode last= null;
        // 要改每条边，所以需要访问链表
        while (head!=null) {
            ListNode nextHead = head.next;
            // 改一条边
            head.next = last;
            // last, head向后移动一位
            last = head;
            head = nextHead;
        }
        return last;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


