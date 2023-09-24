package LinkedList;

public class ReverseLL extends CustomLinkedList{
    public void doReverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        doReverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;

    }
    public void inplaceReverse(){
        Node prev=null;
        Node pres=head;
        Node next=pres.next;
        while (pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }

        }
        head=prev;
    }
}
