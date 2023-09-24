package Trees;

import java.util.ArrayList;

public class BSTMain {
    public static void main(String[] args) {
//        BinarySearchTree bst=new BinarySearchTree(15);
////        bst.insert(10,bst.root);
////        bst.insert(8,bst.root);
////        bst.insert(12,bst.root);
////        bst.insert(5,bst.root);
//        bst.populate(new int[]{15,10,8,12,7,6,5});
//        System.out.println(bst.balanced());
//        bst.display();

        TreeTraversals bst=new TreeTraversals(15);

        bst.populate(new int[]{10,8,12,7,6,5});
        System.out.println("Pre Order :");
        bst.preOrderTraversal(bst.root);
        System.out.println("In Order :");
        bst.inOrderTraversal(bst.root);
        System.out.println("Post Order :");
        bst.postOrderTraversal(bst.root);
//        System.out.println(bst.balanced());
//        bst.display();
        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(list.toString());
    }
}
