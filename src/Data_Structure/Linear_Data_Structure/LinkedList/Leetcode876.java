package Data_Structure.Linear_Data_Structure.LinkedList;

public class Leetcode876 {

    public class ListNode {
        int val;
        Leetcode83.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, Leetcode83.ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
