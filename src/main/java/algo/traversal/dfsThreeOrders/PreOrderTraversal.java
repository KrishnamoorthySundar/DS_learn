package algo.traversal.dfsThreeOrders;

import ds.tree.TreeNode;

import java.util.List;

public class PreOrderTraversal {
    public static List<Integer> preOrderTraversal(TreeNode node, List<Integer> list) {
        list.add(node.getData());
        if (node.getLeft() != null) {
            preOrderTraversal(node.getLeft(), list);
        }
        if (node.getRight() != null) {
            preOrderTraversal(node.getRight(), list);
        }
        return list;
    }
}
