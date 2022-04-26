package codes.dsa.graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name ;
    private boolean visited ;
    private List<Vertex> neighbours ;

    public Vertex(String name) {
        this.name = name;
        this.neighbours = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + '}';
    }

    public void addNeighbour(Vertex vertex){

        this.neighbours.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }
}