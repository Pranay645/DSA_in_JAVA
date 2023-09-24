package LinkedList;

public class DoublyLinkedList {
    Node head;
    public void insertFirst(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null)  head.prev=node;
        head=node;
    }
    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
        }
        Node node=new Node(value);
        Node last =head;
        while(last.next!=null){
            last=last.next;
        }
        node.prev=last;
        last.next=node;
        node.next=null;//Not necessary
    }
    public void insertAt(int value,int index){
        Node node=new Node(value);
        Node prev=getNode(index-1);
        node.prev=prev;
        node.next=prev.next;
        prev.next.prev=node;
        prev.next=node;



    }
    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
   private class Node{
        int value ;
        Node prev;
        Node next;
        Node(int value,Node prev,Node next){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }
        Node(int value){
            this.value=value;
        }
    }
}
