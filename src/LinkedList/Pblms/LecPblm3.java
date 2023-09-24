package LinkedList.Pblms;

public class LecPblm3 {
    public class ListNode3 {
        int val;
        ListNode3 next;
        ListNode3() {}
        ListNode3(int val) { this.val = val; }
        ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
    }
    public class Solution {
        public boolean hasCycle(ListNode3 head) {
            if(head==null)return false;
            ListNode3 fast=head;
            ListNode3 slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
        public int lengthOfCycle(ListNode3 head) {
            ListNode3 fast=head;
            ListNode3 slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    ListNode3 temp=slow;
                    int length=0;
                    do {
                        temp=temp.next;
                        length++;
                    }while (temp!=slow);
                    return length;
                }
            }
            return 0;
        }

        public int  detectCycle(ListNode3 head) {
            if(head==null)return -1;
            ListNode3 first=head;
            ListNode3 second=head;
            int length=lengthOfCycle(head);
            for(int i=0;i<length;i++){
                first=first.next;
            }
            int index=0;
            while (first!=second){
                first=first.next;
                second=second.next;
                index++;
            }

            return index;
        }

    }
}
