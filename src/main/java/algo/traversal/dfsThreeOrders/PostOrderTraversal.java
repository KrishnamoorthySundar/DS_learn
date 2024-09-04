package algo.traversal.dfsThreeOrders;

import ds.tree.TreeNode;

import java.util.List;

public class PostOrderTraversal {
    public static List<Integer> postOrderTraversal(TreeNode node, List<Integer> list) {
        if (node.getLeft() != null) {
            postOrderTraversal(node.getLeft(), list);
        }
        if (node.getRight() != null) {
            postOrderTraversal(node.getRight(), list);
        }
        list.add(node.getData());
        return list;
    }
}
