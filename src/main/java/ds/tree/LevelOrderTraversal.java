package ds.tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode parseNode = queue.remove();
            ans.add(parseNode.data);
            if(parseNode.left != null){
                queue.add(parseNode.left);
            }
            if(parseNode.right != null){
                queue.add(parseNode.right);
            }
        }
        System.out.println("Level Order Traversal : "+ans);
    }
}
