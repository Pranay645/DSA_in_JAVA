package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoundaryTraversal {
    public static boolean isLeaf(BinarySearchTree.Node node){
        if(node.left==null && node.right==null){
            return true;
        }else{
            return false;
        }
    }
   public static void addLeftBoundary(BinarySearchTree.Node root,ArrayList<Integer> ls){
        BinarySearchTree.Node left=root.left;
       while(left!=null){
           if(!isLeaf(left)) ls.add(left.value);
           if(left.left!=null)left=left.left;
           else left=left.right;
       }
   }
   public static void addRightBoundary(BinarySearchTree.Node root,ArrayList<Integer> ls){
        BinarySearchTree.Node rightNode=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while (rightNode!=null){
            if(!isLeaf(rightNode)) temp.add(rightNode.value);
            if(rightNode.right!=null)rightNode=rightNode.right;
            else rightNode=rightNode.left;
        }
       Collections.reverse(temp);
        ls.addAll(temp);
   }
   public static void addLeaf(BinarySearchTree.Node root,ArrayList<Integer> ls){
        if(isLeaf(root)){
            ls.add(root.value);
            return;
        }
        if(root.left!=null)addLeaf(root.left,ls);
        if(root.right!=null)addLeaf(root.right,ls);
   }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree(8);
        bst.populate(new int[]{6,10,4,7,9,11});
        ArrayList<Integer> boundary=new ArrayList<>();
        if(!isLeaf(bst.root))boundary.add(bst.root.value);
        addLeftBoundary(bst.root, boundary);
        addLeaf(bst.root,boundary);
        addRightBoundary(bst.root, boundary);
        System.out.println(boundary.toString());
    }
}
