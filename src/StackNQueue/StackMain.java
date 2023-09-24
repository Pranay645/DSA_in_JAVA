package StackNQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack=new CustomStack(5);
        DynamicStack stack=new DynamicStack(5);
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(53);

        stack.push(83);
        stack.push(32);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());


    }
}
