package codes.dsa.graphs.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    /**
     * This method sets the minimum distance of each vertex from the source vertex
     * @param sourceVertex
     */
    public void computePath(Vertex sourceVertex){
        sourceVertex.setMinDistance(0);

        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while(!priorityQueue.isEmpty()){
            Vertex startVertex = priorityQueue.poll();

            for(Edge edge : startVertex.getAdjacencyList()){
                Vertex targetVertex = edge.getTargetVertex();
                double newDistance = startVertex.getMinDistance() + edge.getWeight();

                if(newDistance < targetVertex.getMinDistance()){
                    targetVertex.setMinDistance(newDistance);
                    targetVertex.setPredecessor(startVertex);
                    priorityQueue.add(targetVertex);
                }
            }
        }
    }

    /**
     * This method will return the shortest path from the sourceVertex, to the asked
     * targetVertex
     * @param targetVertex
     * @return
     */
    public List<Vertex> getShortestPath(Vertex targetVertex){
        List<Vertex> shortestPathToTarget = new ArrayList<>();

        for( Vertex vertex = targetVertex; vertex!=null ;vertex = vertex.getPredecessor()){
            shortestPathToTarget.add(vertex);
        }
        Collections.reverse(shortestPathToTarget);
        return shortestPathToTarget ;
    }

}
