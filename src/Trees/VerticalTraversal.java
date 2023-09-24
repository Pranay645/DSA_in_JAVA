package Trees;

import java.util.*;

public class VerticalTraversal {
    public static void verticalTraversal(BinarySearchTree.Node root,HashMap<Integer,Integer> hs,int verticalLevel){
        if(root==null){
            return;
        }
        if(root.left!=null){
            hs.put(verticalLevel-1,root.left.value);
            verticalTraversal(root.left,hs,verticalLevel-1);
        }
        if(root.right!=null){
            hs.put(verticalLevel+1,root.left.value);
            verticalTraversal(root.right,hs,verticalLevel+1);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree(8);
        bst.populate(new int[]{6,10,4,7,9,11});
        ArrayList<Integer> vertical=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,bst.root.value);
        verticalTraversal(bst.root,hs,0);
        Map<Integer,Integer> hm=new HashMap<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>(hs);
        Iterator itr=tm.keySet().iterator();
        while(itr.hasNext())
        {
            int key=(int)itr.next();
            System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
        }
    }
}
