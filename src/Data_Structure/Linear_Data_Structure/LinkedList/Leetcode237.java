package Data_Structure.Linear_Data_Structure.LinkedList;

public class Leetcode237 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            ListNode dummy = node;

            while(dummy.next.next!=null){
                dummy.val = dummy.next.val;
                dummy = dummy.next;
            }

            dummy.val = dummy.next.val;
            dummy.next = null;
        }
    }
}
