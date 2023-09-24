package Trees;

import com.sun.jdi.VoidValue;

public class BinarySearchTree {
    public class Node{
        protected int value;
        protected Node left;
        protected Node right;
        protected int height;
        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }

    }
    public Node root;
    public BinarySearchTree(int value){
        this.root=new Node(value);
    }
    public int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root Node :");
    }

    protected void display(Node node, String details) {
        if (node==null) return;

        System.out.println(details+node.getValue());

        display(node.left,"Left Child of "+node.getValue()+" is ");
        display(node.right,"Right Child of "+node.getValue()+" is ");
    }
    public void populate(int[] nums){
        for(int i : nums){
            insert(i,root);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    protected void populateSorted(int[] nums,int start,int end){
        if(start<=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(nums[mid],root);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }
    public Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.right),height(node.right));
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    protected boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

}
