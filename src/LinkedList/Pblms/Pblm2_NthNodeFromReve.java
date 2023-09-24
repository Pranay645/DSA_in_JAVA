package LinkedList.Pblms;

public class Pblm2_NthNodeFromReve {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    class Solution {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            if(head==null ){
//                return head;
//            }
//            ListNode revHead=reverseLL(head);
//            ListNode prev=null;
//            ListNode curr=revHead;
//            for(int i=0;i<n-1;i++){
//                prev=curr;
//                curr=curr.next;
//            }
//            if(prev!=null){
//                prev.next=curr.next;
//            }else{
//                prev=curr.next;
//                revHead=prev;
//            }
//
//
//            ListNode oHead=reverseLL(revHead);
//            return oHead;
//        }
//        private ListNode reverseLL(ListNode head){
//            if(head==null || head.next==null){
//                return head;
//            }
//            ListNode prev=null;
//            ListNode curr=head;
//            ListNode Next=curr.next;
//            while(curr!=null){
//                curr.next=prev;
//                prev=curr;
//                curr=Next;
//                if(Next!=null){
//                    Next=Next.next;
//                }
//            }
//            return prev;
//        }
//    }
}
