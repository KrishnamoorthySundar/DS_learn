package ds.tree;

import algo.traversal.BreadthFirstTraversal;
import algo.traversal.DepthFirstTraversal;
import algo.traversal.TraversalFactory;

public class BST {
    TreeNode root;
    TreeNode current;

    public BST(int data) {
        TreeNode treeNode = new TreeNode(data);
        this.root = treeNode;
        this.current = this.root;
    }

    public void insertUsingRecursion(int data) {
        TreeNode newNode = new TreeNode(data);
        if (data == current.data) {
            System.out.println(data + " is already present.");
            return;
        }
        if (data > current.data) {
            if (current.right == null) {
                current.right = newNode;
                return;
            }
            current = current.right;
            insertUsingRecursion(data);
        } else {
            if (current.left == null) {
                current.left = newNode;
                return;
            }
            current = current.left;
            insertUsingRecursion(data);
        }
        current = this.root;
    }

    public void insert(int data){
        TreeNode newNode = new TreeNode(data);
        TreeNode current = this.root;
        while (true) {
            if(data > current.data){
                if(current.right == null){
                    current.right = newNode;
                    return;
                }else{
                    current = current.right;
                }
            } else if(data < current.data) {
                if(current.left == null){
                    current.left = newNode;
                    return;
                }else{
                    current = current.left;
                }
            }
        }
    }

    public void lookup (BST bst, int search){
        TreeNode current = bst.root;
        while (current!=null){
            if(current.data==search){
                System.out.println(search + " is found");
                return;
            }else if(search<current.data){
                current=current.left;
            } else if(search>current.data){
                current=current.right;
            }
        }
        System.out.println(search +" is not found");
    }

    public void remove(BST bst, int data){
        TreeNode current;
        TreeNode previous;
        current = bst.root;
        if(data==current.data){

        }
        while(current!=null){
            if(current.data==data){

            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                "root=" + root +
                "}";
    }

    public static void main(String[] args) {
        BST bst = new BST(9);
        //insert
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
        //lookup
        //bst.lookup(bst,20);
        System.out.println(bst);
        LevelOrderTraversal.levelOrderTraversal(bst.root);
        BreadthFirstSearch.bfs(bst.root, 20);
        DepthFirstSearch.dfs(bst.root, 20);
        BreadthFirstTraversal bft = (BreadthFirstTraversal) TraversalFactory.getTraversalFactory("BFS");
        bft.traverseAndPrint(bst.root);
        DepthFirstTraversal dft = (DepthFirstTraversal) TraversalFactory.getTraversalFactory("DFS");
        dft.traverseAndPrint(bst.root);
    }
}
