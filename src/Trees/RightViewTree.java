package Trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class RightViewTree {
    static class Pair{
        int level;
        BinarySearchTree.Node node;
        Pair(int level, BinarySearchTree.Node node){
            this.level=level;
            this.node=node;
        }
    }
    public static void getRightView(BinarySearchTree.Node root){
        Queue<Pair> queue=new LinkedList<>();
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()){
            Pair temp=queue.poll();
            treeMap.put(temp.level,temp.node.value);
            if(temp.node.left!=null)queue.add(new Pair(temp.level+1,temp.node.left));
            if(temp.node.right!=null)queue.add(new Pair(temp.level+1,temp.node.right));
        }
        for(Map.Entry<Integer,Integer> entry:treeMap.entrySet()){
            System.out.print(entry.getValue() + " ");
        }
    }
    public static void getLeftView(BinarySearchTree.Node root){
        Queue<Pair> queue=new LinkedList<>();
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()){
            Pair temp=queue.poll();
            treeMap.put(temp.level,temp.node.value);
            if(temp.node.right!=null)queue.add(new Pair(temp.level+1,temp.node.right));
            if(temp.node.left!=null)queue.add(new Pair(temp.level+1,temp.node.left));

        }
        for(Map.Entry<Integer,Integer> entry:treeMap.entrySet()){
            System.out.print(entry.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree(8);
        bst.populate(new int[]{6,10,4,7,9,11});
        System.out.print("Right View :");
        getRightView(bst.root);
        System.out.print("Left View :");
        getLeftView(bst.root);
    }
}
