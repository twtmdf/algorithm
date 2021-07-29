package geek.leetcode.week01;

//https://leetcode-cn.com/problems/merge-two-sorted-lists/
//lc21
public class Link2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode protect = new ListNode(0);
        ListNode tail = protect;
        while(l1!= null || l2!=null){
            if (l1!=null&& l2 !=null) {
                if (l1.val<=l2.val) {
                    tail.next = l1;
                    tail = tail.next;
                    l1 = l1.next;
                }else {
                    tail.next = l2;
                    tail = tail.next;
                    l2 = l2.next;
                }
            }else if (l1==null) {
                tail.next = l2;
                break;
            }else if(l2==null) {
                tail.next = l1;
                break;
            }
        }
        return protect.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
