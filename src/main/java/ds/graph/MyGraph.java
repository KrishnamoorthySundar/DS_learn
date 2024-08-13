package ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph {
    int nodeCount=0;
    Map<Integer, List<Integer>> adjacentList = new HashMap<>();

    public int getNodeCount() {
        return nodeCount;
    }

    public MyGraph setNodeCount(int nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    public Map<Integer, List<Integer>> getAdjacentList() {
        return adjacentList;
    }

    public MyGraph setAdjacentList(Map<Integer, List<Integer>> adjacentList) {
        this.adjacentList = adjacentList;
        return this;
    }

    public void addVertex(int nodeData){
        this.adjacentList.put(nodeData, new ArrayList<>());
        this.nodeCount++;
    }

    public void addEdges(int node1, int node2){
        //undirectional
        this.adjacentList.get(node1).add(node2);
        this.adjacentList.put(node1, this.adjacentList.get(node1));
        this.adjacentList.get(node2).add(node1);
        this.adjacentList.put(node2, this.adjacentList.get(node2));
    }

    @Override
    public String toString() {
        return "MyGraph{" +
                "nodeCount=" + nodeCount +
                ", adjacentList=" + adjacentList +
                '}';
    }

    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph();
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addEdges(4,1);
        myGraph.addEdges(4,3);
        myGraph.addEdges(2,3);
        System.out.println(myGraph);
    }
}
