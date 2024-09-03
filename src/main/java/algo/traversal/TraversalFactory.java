package algo.traversal;

public class TraversalFactory {
    public static TraversalFactory getTraversalFactory(String tech){
        TraversalFactory traversalWay = switch (tech){
            case "BFS" -> new BreadthFirstTraversal();
            case "DFS" -> new DepthFirstTraversal();
            default -> new BreadthFirstTraversal();
        };
        return traversalWay;
    }
}
