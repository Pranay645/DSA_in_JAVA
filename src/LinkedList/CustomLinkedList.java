package LinkedList;

public class CustomLinkedList {
    protected   Node head;
    protected Node tail;
    protected int size;
    public CustomLinkedList  (){
        this.size=0;
    }

    public  class Node{

        public int value;
        public Node next;
        Node(int value){
            this.value=value;
        }
        Node(int value,Node next){
            this.next=next ;
            this.value=value;
        }
    }

    //1st Way
//    public void insertUsingRecursion(Node nextNode,int value,int index){
        //1st Way
//        if(index==1){
//            Node newNode=new Node(value);
//            newNode.next=nextNode.next;
//            nextNode.next=newNode;
//            return;
//        }
//        insertUsingRecursion(nextNode.next,value,index-1);
//    }

    //2nd Way
    public Node insertUsingRecursion(Node node,int val,int index){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertUsingRecursion(node.next,val,--index);
        return node;
    }

    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertAt(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
//        Node temp=head;
//        for(int i=0;i<index;i++){
//            temp=temp.next;
//        }
//        Node node=new Node(value,temp.next);
//        temp.next=node;
        head=insertUsingRecursion(head,value,index);
        size++;

    }

    public int deleteFirst(){
        Node temp=head;
        int value =temp.value;
        head=head.next;
        if(head==tail){
            tail=null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node node =getNode(size-2);
        int val= tail.value;
        tail=node;
        tail.next=null;
        size--;
        return val;
    }
    public int deleteAt(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
//        Node node1=getNode(index-1);//prev mode
//        Node node2=getNode(index);//to be delete node
//        int value=node2.value;
//        node1.next=node2.next;
//        node2.next=null;
        //    OR
        Node prev=getNode(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return value;



    }
    public Node getNode(int index){
        Node node =head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public Node findNode(int value){
        Node node=head;
        while (node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void displayList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }


}
