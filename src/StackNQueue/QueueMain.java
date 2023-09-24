package StackNQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue=new CustomQueue(5);
//        queue.insert(4);
//        queue.insert(2);
//        queue.insert(56);
//        queue.insert(23);
//        queue.insert(68);
//        queue.display();
//        System.out.println("Removed Node "+queue.remove());
//        queue.display();

        CircularQueue queue=new CircularQueue(5);
        queue.insert(4);
        queue.insert(2);
        queue.insert(56);
        queue.insert(23);
        queue.insert(68);
        queue.remove();
        queue.remove();
        queue.insert(43);
        queue.insert(67);
        System.out.println(queue.insert((87)));
        queue.display();

//        System.out.println("Removed Node "+queue.remove());
//        queue.display();
        System.out.println(queue.front);
        System.out.println(queue.end);
    }
}
