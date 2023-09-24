package StackNQueue;

public class CircularQueue {
    protected int[] data;
    protected int end=0;
    protected int front=0;
    private int size=0;
    private static final int DEFAULT_SIZE=10;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return size== data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return  false;
        }
//        System.out.println("End "+end);
        data[end++]=item;
        end=end%data.length;
        size++;
        return true ;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty !");
        }
//        System.out.println("Front "+front);
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int i=front;
         do{
             System.out.println(data[i]);
             i++;
             i%=data.length;
         }while (i!=end);
        System.out.println("END");
    }
}
