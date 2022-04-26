package codes.dsa.graphs.dfs;

import java.util.List;
import java.util.Stack;

public class DFSTraversal {

    private Stack<Vertex> stack;

    public DFSTraversal() {

        this.stack = new Stack<>();
    }

    public void dfsTraverse(List<Vertex> vertexList) {
        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsRec(vertex);
            }
        }

    }

    /**
     * Iterative implementation of the DFS
     */
    private void dfsIter(Vertex rootVertex) {
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while (!this.stack.isEmpty()) {
            Vertex currentVertex = this.stack.pop();
            System.out.println("Visited : " + currentVertex);

            for (Vertex v : currentVertex.getNeighbours()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }

    }

    /**
     * Recursive implementation of the DFS
     */
    private void dfsRec(Vertex rootVertex) {
        if (rootVertex == null) {
            return;
        }
        System.out.println("Visited vertex : " + rootVertex);
        for (Vertex neighbour : rootVertex.getNeighbours()) {
            if (!neighbour.isVisited()) {
                neighbour.setVisited(true);
                dfsRec(neighbour);
            }
        }
    }
}

