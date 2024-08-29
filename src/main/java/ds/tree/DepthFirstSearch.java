package ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public static boolean dfs(TreeNode root, int search){
        Stack<TreeNode> nodeStack = new Stack<>();
        List<TreeNode> visitedList = new ArrayList<>();
        TreeNode curr = root;
        nodeStack.push(curr);
        while(!nodeStack.isEmpty()){
            if(curr.data==search){
                System.out.println("dfs:: Found : " + search);
                return true;
            }
            if(curr.left!=null && !visitedList.contains(curr.left)){
                curr = curr.left;
                nodeStack.push(curr);
            }else{
                if(curr.right!=null && !visitedList.contains(curr.right)){
                    curr = curr.right;
                    nodeStack.push(curr);
                }else{
                    visitedList.add(curr);
                    nodeStack.pop();
                    if(!nodeStack.isEmpty()){
                        curr = nodeStack.peek();
                    }
                }
            }
        }
        System.out.println("dfs:: Not Found : " + search);
        return false;
    }
}
