package Trees;

import java.util.*;
//Tree Traversals
//Find max depth/height
public class TreeTraversals extends BinarySearchTree {

    public TreeTraversals(int value) {
        super(value);
    }
    public void preOrderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.getValue());
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public void inOrderTraversal(Node node){
        if(node==null)return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node){
        if(node==null)return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }

    public List<List<Integer>> levelOrderTraversal(Node node){
        Queue<Node> queue=new LinkedList<Node>();
        List<List<Integer>> list=new LinkedList<>();
        if(node==null)return list;
        queue.offer(node);
        while (!queue.isEmpty()){
            int levelNum= queue.size();
            List<Integer> subList=new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                subList.add(queue.poll().value);
            }
            list.add(subList);
        }
        return list;
    }

    public List<Integer> iterativePreorder(Node root){
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            root=st.pop();
            list.add(root.value);
            if(root.right!=null)st.push(root.right);
            if(root.left!=null)st.push(root.left);
        }
        return list;
    }
    public List<Integer> iterativeInorder(Node root){
        List<Integer> list=new ArrayList<>();
        if(root==null)return list;
        Stack<Node> stack=new Stack<>();
        Node node=root;
        while (true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                if(stack.isEmpty()) break;
                node=stack.pop();
                list.add(node.value);
                node=node.right;
            }
        }
        return list;
    }
    public List<Integer> iterativePostorder(Node root){
        List<Integer> list=new  ArrayList<>();
        if(root==null)return list;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.push(root);
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st2.push(root.right);
        }
        while (st2.empty()){
            list.add(st2.pop().value);
        }
        return list;
    }
    public int findMaxDepth(Node root){
        if(root==null) return 0;

        int lh=findMaxDepth(root.left);
        int rh=findMaxDepth(root.right);

        return 1+Math.max(lh,rh);
    }
    //Below function will return hieght of tree if balanced else will return -1
    public int isBalanced(Node root){
        if(root==null) return 0;

        int lh=findMaxDepth(root.left);
        if(lh==-1) return -1;

        int rh=findMaxDepth(root.right);
        if(rh==-1) return -1;

        if(Math.abs(rh-lh)>1)return -1;
        return 1+Math.max(lh,rh);
    }

    //Below function will return height but diametr pass alonged will give the diameter of tree

    static int getDiameterOfBinaryTree(Node node,int[] diameter){
        if(node==null) return 0;

        int lh=getDiameterOfBinaryTree(node.left,diameter);
        int rh=getDiameterOfBinaryTree(node.right,diameter);
        diameter[0]=Math.max(diameter[0],lh+rh);
        //doing this because at the end of recurse the pointer reach at root which might m=be in some case in not involved
        //max width so we have to maintain max (here in form o diameter)
        return 1+Math.max(lh,rh);

    }
    static int maxPathValue( Node node,int[] maxi){
        if(node ==null) return 0;
        int ls=Math.max(maxPathValue(node.left,maxi),0);//has to be done to eliminate lower neg nodes
        int rs=Math.max(maxPathValue(node.right,maxi),0);
        maxi[0]=Math.max(maxi[0],node.value+ls+rs);
        //same as above logic
        return node.value+Math.max(rs,ls);

    }
    static boolean isTreeIdentical(Node root1,Node root2){

        if(root1==null || root2==null){
            return (root1==root2);
        }
        return (root1.value==root2.value) && isTreeIdentical(root1.left,root2.left) && isTreeIdentical(root1.right,root2.right);
    }

  //TC 0(n) SC 0(n)



}
