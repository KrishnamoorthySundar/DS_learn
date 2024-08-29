package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static boolean bfs(TreeNode root, int search){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode parseNode = queue.remove();
            if(parseNode!=null) {
                if (parseNode.data == search) {
                    System.out.println("bfs:: Found : " + search);
                    return true;
                } else {
                    queue.add(parseNode.left);
                    queue.add(parseNode.right);
                }
            }
        }
        System.out.println("bfs:: Not Found : "+search);
        return false;
    }
}
