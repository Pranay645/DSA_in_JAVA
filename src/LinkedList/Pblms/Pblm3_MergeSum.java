package LinkedList.Pblms;

public class Pblm3_MergeSum {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 public ListNode mergeNodes(ListNode head) {
  ListNode dummyHead=new ListNode(0);
  ListNode tail=dummyHead;
  while(head!=null){
   if(head.val==0){
    if(head.next==null){
     break;
    }
    head=head.next;
    int sum=0;
    while(head.val!=0){
     sum=sum+head.val;
     head=head.next;
    }
    ListNode newNode=new ListNode(sum);
    tail.next=newNode;
    tail=tail.next;
   }
  }
  ListNode result=dummyHead.next;
  dummyHead.next=null;

  return result;
 }

}
