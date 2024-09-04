package algo.traversal.dfsThreeOrders;

import ds.tree.TreeNode;

import java.util.List;

public class InOrderTraversal {
    public static List<Integer> inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node.getLeft() != null) {
            inOrderTraversal(node.getLeft(), list);
        }
        list.add(node.getData());
        if (node.getRight() != null) {
            inOrderTraversal(node.getRight(), list);
        }
        return list;
    }
}
