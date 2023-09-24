package Trees;

import java.util.Scanner;

public class BinaryTreePgrm1 {
    private static class Node{
        int value;
         Node left;
         Node right;
         public Node(int value){
             this.value=value;
         }

    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the root Node :");
        int value=sc.nextInt();
        root=new Node(value);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want the enter left of node of "+node.value+" ?");
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of"+node.value);
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want the enter right of node of "+node.value+" ?");

        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of"+node.value);
            int value=sc.nextInt();
            node.right=new Node(value);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(root," ");
    }

    private void display(Node node, String indent) {
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    private void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTreePgrm1 tree=new BinaryTreePgrm1();
        tree.populate(sc);
//        tree.display();
        tree.prettyDisplay(tree.root,0);
    }
}
