package Data_Structure.Linear_Data_Structure.LinkedList;

public class Leetcode141 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next!=null){
            if(fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
