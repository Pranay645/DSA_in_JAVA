package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display(){
        Node node =head;
        if(head!=null){
            do{
                System.out.print(node.value+" -> ");
                node=node.next;
            }while (node!=tail);
            System.out.print(node.value+" -> ");
            System.out.println(head.value);
        }
    }
    public void delete(int val){
        Node node =head;

        if(node==null){
            return;
        }
        if(node.value==val){
            head=head.next;
            tail.next=head;
            return;
        }
        Node prev=null;
        while (node.value!=val){
            prev=node;
            node=node.next;
        }
        prev.next=node.next;
    }
    private class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value=value;
        }
    }
}
