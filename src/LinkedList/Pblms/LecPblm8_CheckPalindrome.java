package LinkedList.Pblms;

public class LecPblm8_CheckPalindrome {
/*

* **
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode mid=getMid(head);
        ListNode headSecond=reverseList(mid);
        ListNode reReverseHead=headSecond;
        while(head!=null && headSecond!=null){
            if(head.val!=headSecond.val){
                break;
            }else{
                head=head.next;
                headSecond=headSecond.next;
            }
        }
        if(head==null || headSecond==null){
            return true;
        }else{
            return false;
        }
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
*/
}
