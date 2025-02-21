package Data_Structure.Linear_Data_Structure.LinkedList;

public class Leetcode83 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null){
                if(fast.val == slow.val){
                    slow.next = fast.next;
                }else{
                    slow = fast;
                }
                fast = fast.next;
            }

            return head;
        }
    }
}
