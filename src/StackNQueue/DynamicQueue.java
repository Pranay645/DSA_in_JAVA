package StackNQueue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    private int size=0;

    @Override
    public boolean insert(int item) {
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }
//        System.out.println("End "+end);
        data[end++]=item;
        end=end%data.length;
        size++;
        return  super.insert(item) ;
    }
}
