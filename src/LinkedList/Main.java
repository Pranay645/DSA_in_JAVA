package LinkedList;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
//        CustomLinkedList list=new CustomLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.displayList();
//
//        list.insertLast(99);
//        list.insertAt(44,2);
//        list.displayList();
//        System.out.println(list.deleteFirst());
//        list.displayList();
//        System.out.println(list.deleteLast());
//        list.displayList();
//        System.out.println(list.deleteAt(2));
//        list.displayList();

//        DoublyLinkedList list=new DoublyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertAt(34,2);
//        list.display();

//        CircularLinkedList cll=new CircularLinkedList();
//        cll.insert(23);
//        cll.insert(56);
//        cll.insert(36);
//        cll.insert(89);
//        cll.insert(12);
//        cll.display();
//        cll.delete(36);
//        cll.display();

//        BubbleSortLL list=new BubbleSortLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.displayList();
//        list.doBubbleSort(list.size-1,0);
//        list.displayList();
        ReverseLL list=new ReverseLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.displayList();
//        list.doReverse(list.head);
        list.inplaceReverse();
        list.displayList();



    }
}
