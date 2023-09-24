package LinkedList;

import org.w3c.dom.Node;

public class BubbleSortLL extends CustomLinkedList{
    public void  doBubbleSort(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
           Node n1=getNode(col);
           Node n2=getNode(col+1);
            if(n2.value<n1.value){
                //swap
                if(n1==head){
                    head=n2;
                    n1.next=n2.next;
                    n2.next=n1;

                }
                else if(n2==tail){
                    Node temp=getNode(col-1);
                    temp.next=n2;
                    n2.next=n1;
                    n1.next=null;
                    tail=n1;
                }
                else{
                    Node temp=getNode(col-1);
                    n1.next=n2.next;
                    n2.next=n1;
                    temp.next=n2;
                }
            }
            doBubbleSort(row,col+1);
        }else{
            doBubbleSort(row-1,0);
        }
    }
}
