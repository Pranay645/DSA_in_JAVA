package StackNQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return end== data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    //Complexity 0(1) for adding
    //While 0(n) for removing0
    public boolean insert(int item){
        if(isFull()){
          return false;
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw  new Exception("Queue is Empty");
        }
        int removed=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception {
        if(isEmpty()){
            throw  new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display() throws Exception {
        if(isEmpty()){
            throw  new Exception("Queue is Empty");
        }
        for(int i=0;i<end;i++){
            System.out.println("Data at "+(i+1)+" th position is "+data[i]);
        }
    }
}
