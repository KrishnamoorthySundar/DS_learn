package algo.traversal;

import ds.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal extends TraversalFactory{
    public void traverseAndPrint(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while(!treeNodeQueue.isEmpty()){
            TreeNode curr = treeNodeQueue.remove();
            if(curr.getLeft() != null) treeNodeQueue.add(curr.getLeft());
            if(curr.getRight() != null) treeNodeQueue.add(curr.getRight());
            answer.add(curr.getData());
        }
        System.out.println("BFT -> "+answer);
    }
}
