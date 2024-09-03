package algo.traversal;

import ds.tree.TreeNode;

import java.util.*;

public class DepthFirstTraversal extends TraversalFactory{
    public void traverseAndPrint(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();
        nodeStack.push(root);
        TreeNode curr = root;
        while(!nodeStack.isEmpty()){
            ans.add(curr.getData());
            if(curr.getLeft()!=null && (!visited.contains(curr.getLeft()))){
                nodeStack.push(curr);
                curr = curr.getLeft();
            } else {
                if(curr.getRight()!=null && (!visited.contains(curr.getRight()))){
                    nodeStack.push(curr);
                    curr = curr.getRight();
                }else{
                    visited.add(curr);
                    curr = nodeStack.pop();
                }
            }
        }
        System.out.println("DFT -> traversal path"+ans);
    }
}
