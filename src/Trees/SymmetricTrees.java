package Trees;

public class SymmetricTrees {
    public static boolean isSymmetric(BinarySearchTree.Node root){
        return isSymmetricHelper(root.left,root.right);
    }
    public static boolean isSymmetricHelper(BinarySearchTree.Node left,BinarySearchTree.Node right){
        if(left==null || right==null){
            return left==right;
        }
        return isSymmetricHelper(left.left,right.right) && isSymmetricHelper(left.right,right.left);
    }
    public static void main(String[] args) {

    }
}
