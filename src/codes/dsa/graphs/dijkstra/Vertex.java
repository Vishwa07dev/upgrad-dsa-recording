package codes.dsa.graphs.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements  Comparable<Vertex>{

    private String name ;
    private List<Edge> adjacencyList ;
    private boolean isVisited ;
    private double minDistance = Double.MAX_VALUE;
    private Vertex predecessor ;

    public Vertex(String name) {
        this.name = name;
        adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Edge edge){
        this.adjacencyList.add(edge);
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Edge> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.getMinDistance());
    }
}
