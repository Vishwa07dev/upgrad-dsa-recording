package codes.dsa.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    public void bfsTraverse(Vertex start) {
        Queue<Vertex> queue = new LinkedList<>();
        start.setVisited(true);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex v = queue.remove();
            System.out.println("Visited : " + v);

            for (Vertex neighbour : v.getAdjacencyList()) {
                if (!neighbour.isVisited()) {
                    neighbour.setVisited(true);
                    queue.add(neighbour);
                }
            }
        }
    }


}
