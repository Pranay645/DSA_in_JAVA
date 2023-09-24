package Trees;

import java.util.*;

public class TopViewTree {
    class Pair{
        BinarySearchTree.Node node;
        int hd;
        Pair(BinarySearchTree.Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public void  getTopView(BinarySearchTree.Node root, ArrayList<Integer> list){
        Queue<Pair> queue=new LinkedList<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        queue.add(new Pair(root,0));
        while (!queue.isEmpty()){
            Pair temp=queue.poll();
            if(!tm.containsKey(temp.hd))tm.put(temp.hd,temp.node.value);

            if(temp.node.left!=null)queue.add(new Pair(temp.node.left,temp.hd-1));
            if(temp.node.right!=null)queue.add(new Pair(temp.node.right,temp.hd+1));
        }
        for (Map.Entry<Integer,Integer> entry :
                tm.entrySet()) {
            System.out.print(entry.getValue() + " ");
            list.add(entry.getValue());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree(8);
        bst.populate(new int[]{6,10,4,7,9,11});
        ArrayList<Integer> ls=new ArrayList<>();
        TopViewTree tp=new TopViewTree();
        tp.getTopView(bst.root,ls);

    }
}
