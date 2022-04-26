package codes.dsa.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name ;
    private List<Vertex> adjacencyList ;

    public Vertex(String name) {
        this.name = name;
        adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){ // TC : O(1)
        if(vertex==null){ // validation of the input argument
            return ;
        }
        this.adjacencyList.add(vertex);
    }

    public void removeNeighbour(Vertex vertex){
        if(vertex== null){
            return ;
        }
        this.adjacencyList.remove(vertex);
    }

    public void showNeighbours(){
        for(Vertex v : this.adjacencyList){
            System.out.println("Edge between "+ this.name + " and "+ v.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + ", adjacencyList=" + adjacencyList + '}';
    }
}
