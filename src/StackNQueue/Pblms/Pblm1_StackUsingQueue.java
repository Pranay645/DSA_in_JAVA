package StackNQueue.Pblms;

import java.util.Stack;

public class Pblm1_StackUsingQueue {
    class MyQueue {
        private Stack<Integer> first;
        private Stack<Integer> second;
        public MyQueue() {
            first=new Stack<>();
            second=new Stack<>();

        }
     // PUSH EFFICIENT
//        public void push(int x) {
//            first.push(x);
//        }
//
//        public int pop() {
//            if(first.isEmpty()){return -1;}
//            while(!first.isEmpty()){
//                int item=first.pop();
//                second.push(item);
//            }
//            int n=second.pop();
//            while(!second.isEmpty()){
//                int item=second.pop();
//                first.push(item);
//            }
//            return n;
//        }
            //POP EFFICIENT
        public void push(int n){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            second.push(n);
            while (!second.isEmpty()){
                first.push(second.pop());
            }
        }
        public int pop(){
            return first.pop();
        }
//        public int peek() {
//            if(first.isEmpty()){return -1;}
//            while(!first.isEmpty()){
//                int item=first.pop();
//                second.push(item);
//            }
//            int n=second.peek();
//            while(!second.isEmpty()){
//                int item=second.pop();
//                first.push(item);
//            }
//            return n;
//        }

        //  POP EFFICIENT
        public int peek(){
            return first.peek();
        }

        public boolean empty() {
            if(first.isEmpty()){return true;}
            else{return false;}
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
